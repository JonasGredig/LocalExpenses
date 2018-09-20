package ch.jonasgredig.localexpenses.view;

import ch.jonasgredig.localexpenses.controller.PaymentController;
import ch.jonasgredig.localexpenses.model.Payment;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TerminalGUI {

    BufferedReader reader;
    PaymentController PaymentController;

    int menuSize = 134;

    public TerminalGUI() {
        reader = new BufferedReader(new InputStreamReader(System.in));
        boolean exitApplication = false;
        while (exitApplication == false) {
            printStartmenu();
            printInputLine();
            try {
                String input = reader.readLine();
                printClear();
                switch (input.toLowerCase().charAt(0)) {
                    case 'a':
                        printAllPaymentsMenu();
                        reader.readLine();
                        break;
                    case 't':
                        //printAllTagsMenu();
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
                printClear();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    // MENUS

    private void printStartmenu() {
        printInfo("Willkommen in Expenses!");
        printMenuText("a - Alle Payments anschauen");
        printMenuText("t - Alle Tags anschauen");
        printMenuText("s - Statistiken der Payments");
        printMenuText("x - Application beenden");
        printSpacerLine();
    }

    private void printAllPaymentsMenu() {
        PaymentController = new PaymentController();

        String seperator = " | ";
        String idTitle = setStringLength("ID",6);
        String userIdTitle = setStringLength("UserID", 6);
        String dateTitle = setStringLength("Datum", 12);
        String amountTitle = setStringLength("Betrag", 15);
        String categoryTitle = setStringLength("Kategorie", 15);
        String opponentTitle = setStringLength("Zahlung an", 15);
        String tagsTitle = setStringLength("Tags", 44);

        printInfo("Meine Payments");


        System.out.println("* " + idTitle + seperator + userIdTitle + seperator + dateTitle + seperator + amountTitle + seperator + categoryTitle + seperator + opponentTitle + seperator + tagsTitle + " *");
        printSpacerLine();
        for (Payment payment : PaymentController.getAllPayments()) {
            String tags = "";
            if (payment.getTags() != null) {
                for (String tag : payment.getTags()) {
                    tags = tags + ", ";
                }
            }

            String id = setStringLength(payment.getId() + "", 6);
            String userId = setStringLength(payment.getUserid() + "", 6);
            String date = setStringLength(payment.getDate().toString(), 12);
            String amount = setStringLength(payment.getAmount() + "", 15);
            String category = setStringLength(payment.getCategory(), 15);
            String opponent = setStringLength(payment.getOpponent(), 15);
            tags = setStringLength(tags, 44);


            System.out.println("* " + id + seperator + userId + seperator + date + seperator + amount + seperator + category + seperator + opponent + seperator + tags + " *");
        }
        printInfo("Drücke eine Taste um wieder ins Hauptmenu zu gelangen!");
    }


    // UTLILITIES TODO -> REFACTOR IN UTILITY


    private String setStringLength(String s, int length) {
        while (s.length() < length) {
            s = " " + s;
        }
        if (s.length() > length) {
            s = s.substring(0,length);
        }
        return s;
    }


    private void printInfo(String s) {
        printSpacerLine();
        printMenuText(s);
        printSpacerLine();
    }

    private void printMenuText(String text) {
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

    private void printSpacerLine() {
        String spacer = "";
        int size = (menuSize / 2) - 1;
        for (int i = 0; i <= size; i++) {
            spacer = spacer + "* ";
        }
        spacer = spacer + "*";
        System.out.println(spacer);
    }

    private void printInputLine() {
        System.out.print(">>>");
    }

    private void printClear() {
        for (int i = 0; i <= 25; i++) {
            System.out.println("");
        }
    }
}
