package com.gm.banksystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Account> cuentas = new ArrayList<>();
        boolean exit = true;

        boolean isLogged = false;

        int generador;
        int generador2;
        while (exit == true) {
            System.out.println("1. Create an account\n"
                    + "2. Log into account\n"
                    + "0. Exit");

            generador = scan.nextInt();

            switch (generador) {

                case 0:
                    exit = false;
                    System.out.println("Bye");
                    break;

                case 1:
                    cuentas.add(createAccount());
                    break;
                case 2:
                    Account mainAcount = log(scan, cuentas);
                    if (mainAcount != null) {
                        isLogged = true;

                        while (isLogged == true) {
                            System.out.println("1. Balance\n"
                                    + "2. Log out\n"
                                    + "0. Exit\n");
                            generador2 = scan.nextInt();

                            switch (generador2) {
                                case 0:
                                    System.out.println("Bye");
                                    exit = false;
                                    isLogged = false;

                                    break;
                                case 1:
                                    System.out.println(mainAcount.getBalance());
                                    break;

                                case 2:
                                    System.out.println("You have successfully logged out!");
                                    isLogged = false;
                                    break;

                            }

                        }

                    }

            }

        }
    }

    private static Account log(Scanner scan, List<Account> cuentas) {

        long card;
        int pin;

        System.out.println("Enter your card number:");
        card = scan.nextLong();
        System.out.println("Enter your pin");
        pin = scan.nextInt();
        for (int i = 0; i < cuentas.size(); i++) {
            if (card == cuentas.get(i).getNumCard() && pin == cuentas.get(i).getPin()) {
                System.out.println("You have successfully logged in!");
                return cuentas.get(i);
            }
        }
        System.out.println("Wrong card number or PIN!");
        return null;
    }

    private static Account createAccount() {
        System.out.println("Your card has been created");
        ///long newCard = cuenta.passLunhTest();
        int newPin = (int) (Math.random() * 9999-1000) + 1000;
        
        Account cuenta = new Account();
        cuenta.setNumCard();
        cuenta.setPin(newPin);
        System.out.println("Your card numer: ");
        System.out.println(cuenta.getNumCard());
        System.out.println("Your pin: ");
        System.out.println(cuenta.getPin());
        return cuenta;
    }

   

}


