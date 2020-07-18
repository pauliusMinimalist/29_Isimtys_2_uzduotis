package com.company;

import java.util.Random;

public class Lektuvas {

    public void isskleistiVaziuokle() {
        Random rand = new Random();
        int atsitiktinisSkaicius = rand.nextInt(10);
        System.out.println(4 / atsitiktinisSkaicius);
        System.out.println("OK: važiuoklė sėkmingai išskleista");


    }

}
