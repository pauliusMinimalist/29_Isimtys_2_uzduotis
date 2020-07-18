package com.company;

import java.util.Random;

public class Lektuvas {

    Random rand = new Random();

    public void isskleistiVaziuokle() {

        try {
            vaziuokle();
        } catch (VaziuoklesIsskleidimoKlaida e) {
            System.out.println("ERROR: " + e.getPriezastis());
        } finally {
            System.out.println("INFO: lėktuvas skrenda");
        }
    }

    public void vaziuokle() throws VaziuoklesIsskleidimoKlaida {
        int atsitiktinisSkaicius = rand.nextInt(10);
        switch (atsitiktinisSkaicius) {
            case 0:
                throw new VaziuoklesIsskleidimoKlaida("neatsidarė durys");
            case 1:
                throw new VaziuoklesIsskleidimoKlaida("nenusileido ratas");
            case 2:
                throw new VaziuoklesIsskleidimoKlaida("nesuveikė variklis");
        }
    }
}
