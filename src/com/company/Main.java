package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int randomJump = random.nextInt(231);
        System.out.println("Oddano skok na odległość  " + randomJump + " m");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int tab[];
        tab = new int[5];
        for (int i = 0; i < 5; i++) { //Pętla generuje 5 not sędziowskich z przedziału 0-20.
            int randomNote = random.nextInt(21);
            System.out.println("Nota sędziowska za styl:  " + randomNote);
            tab[i] = randomNote;
        }

        Arrays.sort(tab);

        int sum = 0;
        for(int i = 1; i <4; i++){ //Ostateczna nota sędziowska jest sumą 3 z 5 wystawionych not (odrzucane są skarjne oceny).
            sum+=tab[i];
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Ostateczna nota sędziowska: " + sum);
    }
}