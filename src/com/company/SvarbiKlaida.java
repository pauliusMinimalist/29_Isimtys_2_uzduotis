package com.company;

public class SvarbiKlaida extends VaziuoklesIsskleidimoKlaida {

    private final String svarba = "Svarbumas: svarbi";

    public SvarbiKlaida(String message) {
        super(message);
    }

    public String getSvarba() {
        return svarba;
    }
}
