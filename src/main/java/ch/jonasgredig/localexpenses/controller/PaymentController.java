package ch.jonasgredig.localexpenses.controller;

import ch.jonasgredig.localexpenses.model.Payment;

import java.util.ArrayList;
import java.util.Date;

public class PaymentController implements IPaymentController {

    /**
     * Get 10 Payments
     *
     * @param pagination INTEGER
     */
    public ArrayList<Payment> getPayments(int pagination) {


        return new ArrayList<>();
    }

    @Override
    public int getAmountPaymets() {
        return 0;
    }
}
