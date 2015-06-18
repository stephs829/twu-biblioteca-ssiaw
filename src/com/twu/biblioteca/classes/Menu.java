package com.twu.biblioteca.classes;

import java.util.ArrayList;

public class Menu {

    public static ArrayList<String> menuOptions = new ArrayList<String> ();

    public static void addOptions(){
        menuOptions.add("List Available Books");
        menuOptions.add("Return Book");
        menuOptions.add("Quit");
    }

    public static void printOptions(){
        String menu = "Please select from the options below:";
        addOptions();
        for(String option : menuOptions){
            String menuOption = "\n" + (menuOptions.indexOf(option)+1) + ". " + option;
            menu += menuOption;
        }

        System.out.println(menu);
    }

    public static void invalidOptionMessage() {
        System.out.println("Invalid option. Please select a valid option.");
    }

    public static void selectMenuOption(int optionNumber) {
        try {
            if (optionNumber <= 0 || optionNumber > menuOptions.size()) {
                invalidOptionMessage();
            } else {
                å
            }
        } catch (Exception e) {
            invalidOptionMessage();
        }
    }

}
