package ch.jonasgredig.localexpenses.controller.mockController;

import ch.jonasgredig.localexpenses.controller.IPaymentController;
import ch.jonasgredig.localexpenses.controller.PaymentController;
import ch.jonasgredig.localexpenses.model.Payment;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

public class MockPaymentController implements IPaymentController {

    ArrayList<Payment> payments;

    public MockPaymentController() {
        payments = new ArrayList<>();
        payments.add(new Payment(1, 1, 5.0f, new Date(), "EINKAUF", "COOP", null, false));
        payments.add(new Payment(2, 1, 18.5f, new Date(), "EINKAUF", "MIGROS", null, false));
        payments.add(new Payment(3, 1, 180.5f, new Date(), "EINKAUF", "COOP", null, false));
        payments.add(new Payment(4, 1, 108.5f, new Date(), "EINKAUF", "MIGROS", null, false));
        payments.add(new Payment(5, 1, 18.55f, new Date(), "EINKAUF", "COOP", null, false));
        payments.add(new Payment(6, 1, 187.5f, new Date(), "EINKAUF", "MIGROS", null, false));
        payments.add(new Payment(7, 1, 178.5f, new Date(), "EINKAUF", "COOP", null, false));
        payments.add(new Payment(8, 1, 718.5f, new Date(), "EINKAUF", "MIGROS", null, false));
        payments.add(new Payment(9, 1, 1877.5f, new Date(), "EINKAUF", "COOP", null, false));
        payments.add(new Payment(10, 1, 188.5f, new Date(), "EINKAUF", "MIGROS", null, false));
        payments.add(new Payment(11, 1, 188.55f, new Date(), "EINKAUF", "COOP", null, false));
        payments.add(new Payment(12, 1, 1.55f, new Date(), "EINKAUF", "Interdiscount", null, false));
        payments.add(new Payment(13, 1, 8.55f, new Date(), "EINKAUF", "Fust", null, false));
    }

    /**
     * Get 10 Payments
     *
     * @param pagination INTEGER
     */
    @Override
    public ArrayList<Payment> getPayments(int pagination) {

        pagination = pagination * 10;
        ArrayList<Payment> resultPayments = new ArrayList<>();

        for (int i = pagination - 10; i < pagination; i++) {
            resultPayments.add(payments.get(i));
        }

        return resultPayments;
    }

    @Override
    public int getAmountPaymets() {
        float amountPages = ((float) payments.size()) / 10f;
        return (int) Math.ceil(amountPages);
    }


}
