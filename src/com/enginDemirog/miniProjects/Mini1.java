package com.enginDemirog.miniProjects;

public class Mini1 {
    public static void main(String[] args) {

        int number = 78;

        boolean isPrime = false;

        for(int i=2; i < number; i++) {
            if(number % i == 0) {
                isPrime = false;
            }
        }

        if(number < 1) {
            System.out.println("Unvalid number.");
            return;
        }

        if(isPrime == false || number == 1) {
            System.out.println("Number is not prime.");
        } else{
            System.out.println("Number is prime.");
        }
    }

}