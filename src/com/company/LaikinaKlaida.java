package com.company;

public class LaikinaKlaida extends VaziuoklesIsskleidimoKlaida {

    private final String svarba = "Svarbumas: laikina";

    public LaikinaKlaida(String message) {
        super(message);
    }

    public String getSvarba() {
        return svarba;
    }
}
