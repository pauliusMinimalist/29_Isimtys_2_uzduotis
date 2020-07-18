package com.company;

import java.util.Random;

public class Lektuvas {

    public void isskleistiVaziuokle() {
        Random rand = new Random();
        int atsitiktinisSkaicius = rand.nextInt(10);
        try {
            int x = 5 / atsitiktinisSkaicius;
            System.out.println("OK: važiuoklė sėkmingai išskleista");
            ///////////////////////////////////////////////////////////
            if (x == 5) {
                ("skrendu").charAt(20);
            }
        } catch (ArithmeticException e) {
            System.out.println("ERROR: važiuoklės išskleisti nepavyko");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("ERROR: nepavyko išskleisti važiuoklės dėl kitos klaidos");
        } finally {
            System.out.println("INFO: lėktuvas skrenda");
        }
    }

}
