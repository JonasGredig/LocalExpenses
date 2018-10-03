package ch.jonasgredig.localexpenses.controller;

import ch.jonasgredig.localexpenses.model.Payment;

import java.util.ArrayList;

public interface IPaymentController {

    public ArrayList<Payment> getPayments(int pagination);
    public int getAmountPaymets();
}
