package ch.jonasgredig.localexpenses.controller;

import ch.jonasgredig.localexpenses.model.Payment;

import java.util.ArrayList;
import java.util.Date;

public class PaymentController {
    public ArrayList<Payment> getAllPayments() {
        ArrayList<Payment> payments = new ArrayList<Payment>();
        payments.add(new Payment(1,1, 5.0f, new Date(), "EINKAUF", "COOP", null, false));
        payments.add(new Payment(2, 1, 18.5f, new Date(), "EINKAUF", "MIGROS", null, false));
        return payments;
    }
}
