package com.company;

public class VaziuoklesIsskleidimoKlaida extends Exception {

    private String priezastis;

    public VaziuoklesIsskleidimoKlaida(String message) {
        super(message);
        this.priezastis = message;
    }

    public String getPriezastis() {
        return priezastis;
    }
}
