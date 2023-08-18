package com.enginDemirog.miniProjects;

public class Mini5 {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,5,7,9,0};

        int willFind = 89;
        boolean isThere = false;

        for (int number : numbers) {
            if (number == willFind) {
                isThere = true;
                break;
            }
        }

        if (isThere) {
            System.out.println( willFind + " is found.");
        } else {
            System.out.println( willFind + " is not found.");
        }
    }
}
