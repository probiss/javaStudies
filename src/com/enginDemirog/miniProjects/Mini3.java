package com.enginDemirog.miniProjects;

public class Mini3 {
    public static void main(String[] args) {
        int number = 78;
        int total = 0;
        for(int i=1; i < number; i++) {
            if(number % i == 0) {
                total += i;
            }
        }

        if( total == number) {
            System.out.println("Perfect number.");
        } else {
            System.out.println("Not a perfect number.");
        }
    }
}
