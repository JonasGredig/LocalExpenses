package ch.jonasgredig.localexpenses.util;

import java.util.ArrayList;

public class TerminalGuiUtils {

    public int menuSize = 134;

    public String setStringLength(String s, int length) {
        while (s.length() < length) {
            s = " " + s;
        }
        if (s.length() > length) {
            s = s.substring(0,length);
        }
        return s;
    }


    public void printInfo(String message) {
        printSpacerLine();
        printMenuText(message);
        printSpacerLine();
    }

    public void printInfo(String[] messages) {
        printSpacerLine();
        for (String message : messages) {
            printMenuText(message);
            printSpacerLine();
        }
    }

    public void printMenuText(String text) {
        while (text.length() < menuSize - 1) {
            if (text.length() == (menuSize - 2)) {
                text = text + " ";
            } else {
                text = " " + text + " ";
            }
        }
        String alignedText = "*" + text + "*";

        System.out.println(alignedText);
    }

    public void printSpacerLine() {
        String spacer = "";
        int size = (menuSize / 2) - 1;
        for (int i = 0; i <= size; i++) {
            spacer = spacer + "* ";
        }
        spacer = spacer + "*";
        System.out.println(spacer);
    }

    public void printInputLine() {
        System.out.print(">>>");
    }

    public void printClear() {
        for (int i = 0; i <= 25; i++) {
            System.out.println("");
        }
    }
}
