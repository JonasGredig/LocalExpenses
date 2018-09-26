package ch.jonasgredig.localexpenses.view;

import ch.jonasgredig.localexpenses.controller.PaymentController;
import ch.jonasgredig.localexpenses.model.Payment;
import ch.jonasgredig.localexpenses.util.TerminalGuiUtils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TerminalGui {

    BufferedReader reader;
    PaymentController PaymentController;
    TerminalGuiUtils terminalGuiUtils;


    public TerminalGui() {

        reader = new BufferedReader(new InputStreamReader(System.in));
        terminalGuiUtils = new TerminalGuiUtils();

        boolean exitApplication = false;

        while (exitApplication == false) {
            printStartmenu();
            terminalGuiUtils.printInputLine();
            try {
                String input = reader.readLine();
                terminalGuiUtils.printClear();
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
                        terminalGuiUtils.printMenuText("Programm wird beendet!");
                        System.exit(0);
                    default:
                        terminalGuiUtils.printInfo("Fehler! Unbekannte Eingabe!");
                }
                terminalGuiUtils.printClear();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    // MENUS

    private void printStartmenu() {
        terminalGuiUtils.printInfo("Willkommen in Expenses!");
        terminalGuiUtils.printMenuText("a - Alle Payments anschauen");
        terminalGuiUtils.printMenuText("t - Alle Tags anschauen");
        terminalGuiUtils.printMenuText("s - Statistiken der Payments");
        terminalGuiUtils.printMenuText("x - Application beenden");
        terminalGuiUtils.printSpacerLine();
    }

    private void printAllPaymentsMenu() {
        PaymentController = new PaymentController();

        String seperator = " | ";
        String idTitle = terminalGuiUtils.setStringLength("ID",6);
        String userIdTitle = terminalGuiUtils.setStringLength("UserID", 6);
        String dateTitle = terminalGuiUtils.setStringLength("Datum", 12);
        String amountTitle = terminalGuiUtils.setStringLength("Betrag", 15);
        String categoryTitle = terminalGuiUtils.setStringLength("Kategorie", 15);
        String opponentTitle = terminalGuiUtils.setStringLength("Zahlung an", 15);
        String tagsTitle = terminalGuiUtils.setStringLength("Tags", 44);

        terminalGuiUtils.printInfo("Meine Payments");

        System.out.println("* " + idTitle + seperator + userIdTitle + seperator + dateTitle + seperator + amountTitle + seperator + categoryTitle + seperator + opponentTitle + seperator + tagsTitle + " *");
        terminalGuiUtils.printSpacerLine();
        for (Payment payment : PaymentController.getAllPayments()) {
            String tags = "";
            if (payment.getTags() != null) {
                for (String tag : payment.getTags()) {
                    tags = tags + ", ";
                }
            }

            String id = terminalGuiUtils.setStringLength(payment.getId() + "", 6);
            String userId = terminalGuiUtils.setStringLength(payment.getUserid() + "", 6);
            String date = terminalGuiUtils.setStringLength(payment.getDate().toString(), 12);
            String amount = terminalGuiUtils.setStringLength(payment.getAmount() + "", 15);
            String category = terminalGuiUtils.setStringLength(payment.getCategory(), 15);
            String opponent = terminalGuiUtils.setStringLength(payment.getOpponent(), 15);
            tags = terminalGuiUtils.setStringLength(tags, 44);

            System.out.println("* " + id + seperator + userId + seperator + date + seperator + amount + seperator + category + seperator + opponent + seperator + tags + " *");
        }
        terminalGuiUtils.printInfo("Drücke eine Taste um wieder ins Hauptmenu zu gelangen!");
    }
}
