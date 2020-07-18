package com.company;

public class VaziuoklesIsskleidimoKlaida extends Exception {

    private String priezastis;
    private final String svarba = "Svarbumas: nežinoma";

    public VaziuoklesIsskleidimoKlaida(String message) {
        super(message);
        this.priezastis = message;
    }

    public String getPriezastis() {
        return priezastis;
    }

    public String getSvarba() {
        return svarba;
    }
}
