package com.company;

import java.util.Random;

public class Lektuvas {

    Random rand = new Random();

    public void isskleistiVaziuokle() {

        try {
            vaziuokle();
        } catch (LaikinaKlaida e) {
            System.out.println("ERROR: " + e.getPriezastis() + ". " + e.getSvarba());
        } catch (SvarbiKlaida e) {
            System.out.println("ERROR: " + e.getPriezastis() + ". " + e.getSvarba());
        } catch (VaziuoklesIsskleidimoKlaida e) {
            System.out.println("ERROR: " + e.getPriezastis() + ". " + e.getSvarba());
        } finally {
            System.out.println("INFO: lėktuvas skrenda");
        }
    }

    public void vaziuokle() throws VaziuoklesIsskleidimoKlaida {
        int atsitiktinisSkaicius = rand.nextInt(10);
        switch (atsitiktinisSkaicius) {
            case 0:
                throw new SvarbiKlaida("neatsidarė durys");
            case 1:
                throw new SvarbiKlaida("nenusileido ratas");
            case 2:
                throw new LaikinaKlaida("nesuveikė variklis");
        }
    }
}
