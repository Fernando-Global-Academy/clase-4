package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Seleccione una opcion:");
        System.out.println("1) ex1");
        System.out.println("2) ex2");
        System.out.println("3) ex3");
        Scanner s = new Scanner(System.in);
        int option = s.nextInt();
        switch (option) {
            case 1:
                ex1();
                break;
            case 2:
                ex2();
                break;
            case 3:
                ex3();
                break;
        }
    }

    private static void ex3() {
        System.out.println("ejercicio 3");
    }

    private static void ex2() {
        System.out.println("ejercicio 2");
    }

    private static void ex1() {
        System.out.println("ejercicio 1");
    }
}
