package parser;

import data.Block;
import data.Cv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by diogo on 03/06/2016.
 */
public class CLI {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    private ArrayList<Block> blocks;
    private BufferedReader scan;

    public CLI(Cv cv) {
        this.blocks = cv.blocks;
        scan = new BufferedReader(new InputStreamReader(System.in));
    }

    public static Settings consoleGetSettings() {
        System.out.print("File to Parse: ");
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        try {
            Settings set;
            String fileName = scan.readLine();
            if (fileName.equals("")) {
                fileName = "resources/mdFiles/cv.md";
            }
            Settings.LanguageOutput lang = Settings.LanguageOutput.HTML;
            System.out.println("Color (RED|GREEN|BLUE|PINK|ORANGE|GREY|DARK) : ");
            String outputColor = scan.readLine();
            Settings.Color color;
            switch (outputColor) {
                case "RED":
                    color = Settings.Color.RED;
                    break;
                case "GREEN":
                    color = Settings.Color.GREEN;
                    break;
                case "BLUE":
                    color = Settings.Color.BLUE;
                    break;
                case "PINK":
                    color = Settings.Color.PINK;
                    break;
                case "ORANGE":
                    color = Settings.Color.ORANGE;
                    break;
                case "GREY":
                    color = Settings.Color.GREY;
                    break;
                case "DARK":
                    color = Settings.Color.DARK;
                    break;
                default:
                    color = Settings.Color.RED;
                    break;
            }

            set = new Settings(color, fileName, lang);
            return set;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    public void consoleGetBlocks() {
        String s = "";
        while (true) {
            displayIndex();
            System.out.println("Here you have the list of blocks you can choose to remove, just insert the numbers " +
                    "separated by <SPACE> " +
                    "followed by <ENTER>");

            try {
                s = scan.readLine();
                String[] numbers = s.split("\\s+");
                if (numbers.length > 0 && !numbers[0].equals(""))
                    removeBlocks(numbers);
                displayConfirm();
                System.out.println("Is that all you want to remove? (y|n)");
                s = scan.readLine();
                if (s.equals("y") || s.equals("yes")) {
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Okay! Thank you. Now we are going to use this to create your Awsome-CV ^^");

    }

    private void displayConfirm() {
        System.out.println("\n");
        for (int i = 0; i < this.blocks.size(); i++) {
            Block b = this.blocks.get(i);
            if (b.isSelected())
                System.out.println(ANSI_GREEN + (i + 1) + " " + b.getBlockName() + ANSI_RESET);
            else
                System.out.println(ANSI_RED + (i + 1) + " " + b.getBlockName() + ANSI_RESET);
            if (b.subBlocks.size() > 0) {
                for (int k = 0; k < b.subBlocks.size(); k++) {
                    if (b.subBlocks.get(k).getSubBlockName() != null)
                        if (b.subBlocks.get(k).isSelected())
                            System.out.println("\t" + ANSI_GREEN + (i + 1) + "." + (k + 1) + " " + b.subBlocks.get(k)
                                    .getSubBlockName() + ANSI_RESET);
                        else
                            System.out.println("\t" + ANSI_RED + +(i + 1) + "." + (k + 1) + " " + b.subBlocks.get(k)
                                    .getSubBlockName() + ANSI_RESET);

                }
            }
        }
    }

    private void removeBlocks(String[] numbers) {
        for (String numString : numbers) {
            String[] nums = numString.split("\\.");
            int subBlockNum;
            int blockNum = Integer.valueOf(nums[0]);
            try {
                if (nums.length > 1) {
                    subBlockNum = Integer.valueOf(nums[1]);
                    this.blocks.get(blockNum - 1).subBlocks.get(subBlockNum - 1).setSelected(false);
                    if (this.blocks.get(blockNum - 1).allNotSelected())
                        this.blocks.get(blockNum - 1).setSelected(false);
                } else
                    this.blocks.get(blockNum - 1).setSelected(false);
            } catch (IndexOutOfBoundsException e) {
                System.err.println("Section " + numString + " does not exists!");
            }
        }
    }

    public void displayIndex() {
        System.out.println("\n");
        for (int i = 0; i < this.blocks.size(); i++) {
            Block b = this.blocks.get(i);
            if (b.isSelected())
                System.out.println((i + 1) + " " + b.getBlockName());
            else
                System.out.println(ANSI_RED + (i + 1) + " " + b.getBlockName() + ANSI_RESET);
            if (b.subBlocks.size() > 0) {
                for (int k = 0; k < b.subBlocks.size(); k++) {
                    if (b.subBlocks.get(k).getSubBlockName() != null)
                        if (b.subBlocks.get(k).isSelected())
                            System.out.println("\t" + (i + 1) + "." + (k + 1) + " " + b.subBlocks.get(k)
                                    .getSubBlockName());
                        else
                            System.out.println("\t" + ANSI_RED + +(i + 1) + "." + (k + 1) + " " + b.subBlocks.get(k)
                                    .getSubBlockName() + ANSI_RESET);

                }
            }
        }
    }
}
