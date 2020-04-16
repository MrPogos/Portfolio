package com.company;

public class Main {
    private static String TEKST="ALa MA KOTA";
    public static void main(String[] args) {
        System.out.println(TEKST);
        String s="basia ma kota";
        printxrazy(s,3);

    }
    public static void printxrazy(String s,int liczba){
        for (int i=0;i<liczba;i++)
        {
            System.out.println(s);
        }
    }
}
