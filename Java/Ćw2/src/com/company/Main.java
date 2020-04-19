package com.company;

import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        int a = 9000;
        System.out.println("Twoja pensja to: " + (a + 1000) + " złotych na miesiąc.");
        Mezczyzna mezczyzna = new Mezczyzna();
        Kobieta kobieta = new Kobieta();
        mezczyzna.wiek = 23;
        mezczyzna.wzrost = 180;
        mezczyzna.partnerka = kobieta;
        kobieta.wiek = 23;
        kobieta.wzrost = 170;
        kobieta.partner = mezczyzna;
        int b=1;

        for(int i=1;i<10;i++)
        {
            b=b*(i+1);
        }
        System.out.println(b);

        wyswieetl(5);
        for(int i=1;i<11;i++)
        {
            for(int z=1;z<11;z++)
            {
                System.out.print(i*z);
            }
        System.out.println("");
        }
        new Czerwony();
        new Pomaranczowy();
        new Zolty();
        new Zielony();
        new Niebieski();
        new  Granatowy();
        new Fioletowy();
        String texta=" przejmie władzę nad światem za ",textb=" lat. Mua ha ha!";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String imie = reader.readLine();
        String sWiek = reader.readLine();
        int nWiek = Integer.parseInt(sWiek);
        System.out.println(imie+texta+nWiek+textb);
    }

    public static class Czerwony {
        public Czerwony() {
            System.out.println("Czerwony");
        }
    }

    public static class Pomaranczowy {
        public Pomaranczowy() {
            System.out.println("Pomarańczowy");
        }
    }

    public static class Zolty {
        public Zolty() {
            System.out.println("Żółty");
        }
    }

    public static class Zielony {
        public Zielony() {
            System.out.println("Zielony");
        }
    }

    public static class Niebieski {
        public Niebieski() {
            System.out.println("Niebieski");
        }
    }

    public static class Granatowy {
        public Granatowy() {
            System.out.println("Granatowy");
        }
    }

    public static class Fioletowy {
        public Fioletowy() {
            System.out.println("Fioletowy");
        }
    }


    public static void wyswieetl(int w)
    {
        for (int i=0;i<w;i++)
        {
            int z=0;
            for(int x=0;x<=i;x++)
            {
                z=z+(z+1);
            }
            System.out.println(z);
        }
    }




    public static class Mezczyzna {
        public int wiek;
        public int wzrost;
        public Kobieta partnerka;
    }

    public static class Kobieta {
        public int wiek;
        public int wzrost;
        public Mezczyzna partner;
    }
}
