package ch.jonasgredig.localexpenses.view;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TerminalGUI {

    BufferedReader reader;

    public TerminalGUI() {
        reader = new BufferedReader(new InputStreamReader(System.in));
        boolean exitApplication = false;
        while (exitApplication == false) {
            printStartmenu();
            printInputLine();
            try {
                String name = reader.readLine();
                printClear();
                switch (name.toLowerCase().charAt(0)) {
                    case 'a':
                        //TODO
                        break;
                    case 't':
                        //TODO
                        break;
                    case 's':
                        //TODO
                        break;
                    case 'x':
                        printMenuText("Programm wird beendet!");
                        System.exit(0);
                    default:
                        printInfo("Fehler! Unbekannte Eingabe!");
                }
            } catch (Exception e) {
                System.out.println("ERROR");
            }
        }
    }

    private void printClear() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("");
        }
    }

    private void printInfo(String s) {
        printSpacerLine();
        printMenuText(s);
        printSpacerLine();
    }

    private void printStartmenu() {
        printInfo("Willkommen in Expenses!");
        printMenuText("a - Alle Payments anschauen");
        printMenuText("t - Alle Tags anschauen");
        printMenuText("s - Statistiken der Payments");
        printMenuText("x - Application beenden");
        printSpacerLine();
    }

    private void printMenuText(String text) {
        while (text.length() < 37) {
            if (text.length() == 36) {
                text = text + " ";
            } else {
                text = " " + text + " ";
            }
        }
        String alignedText = "*" + text + "*";

        System.out.println(alignedText);
    }

    private void printSpacerLine() {
        System.out.println("* * * * * * * * * * * * * * * * * * * *");
    }

    private void printInputLine() {
        System.out.print(">>>");
    }
}
