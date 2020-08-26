/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gm.banksystem;

public class Account {

    private long numCard;
    private int pin;
    private int balance;

    public Account() {
       
    }
     private static long passLunhTest() {
        boolean pass = false;
        long[] numberChar = new long[16];
        long sumCard = 0;
        long cardAux=0;
       long card=0;
        while (pass == false) {
            sumCard=0;
            long max=9999999999l;
            card =4000000000000000l+(long)(Math.random()*(max-1)+1);
               cardAux=card;
            for (int i = numberChar.length - 1; i >= 0; i--) {
                numberChar[i] = cardAux % 10;
                cardAux = cardAux / 10;

            }

            for (int i = 0; i < numberChar.length - 1; i++) {
                if (i % 2 == 0) {
                    numberChar[i] = numberChar[i] * 2;

                }
            
            }
        
            for (int i = 0; i < numberChar.length - 1; i++) {
                if (numberChar[i] > 9) {
                    numberChar[i] = numberChar[i] - 9;

                }
               

            }
          
            for (int i = 0; i < numberChar.length; i++) {
                sumCard = sumCard + numberChar[i];
              
            }
          
            if (sumCard%10==0) {
              
                pass = true;
                
            }
          
        }
     
        return card;
    }

    public long getNumCard() {
        return numCard;
    }

    public void setNumCard() {
        this.numCard = passLunhTest();
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" + "numCard=" + numCard + ", pin=" + pin + ", balance=" + balance + '}';
    }

    class cuentas {

        public cuentas() {
        }
    }

}