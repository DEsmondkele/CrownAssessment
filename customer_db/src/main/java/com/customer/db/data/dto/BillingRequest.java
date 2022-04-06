package com.customer.db.data.dto;

import lombok.Data;

import java.security.SecureRandom;
import java.util.Random;

@Data
public class BillingRequest {


    private static int accountNumber;
    private String tariff;
    public static String setAccountNumber() {
        int accountNumber;

        Random rand = new Random();
        accountNumber= rand.nextInt(123456789);
        return (BillingRequest.accountNumber = accountNumber) + "-1";

    }

    public static int getAccountNumber() {
        return accountNumber;
    }

    public String getTariff() {
        return tariff;
    }

    public void setTariff(String tariff) {
        this.tariff = tariff;
    }
    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
