package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("Oblicz silnię z n");
        System.out.println("Podaj n ");

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int value = 1;

        for (int i = 1; i <= n; i++) {

            value = value * i;
        }

        System.out.println("Silnia z liczby: " + n + " wynosi: " + value);
    }
}
