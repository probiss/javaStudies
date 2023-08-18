package com.enginDemirog.miniProjects;

public class Mini2 {
    public static void main(String[] args) {

        char letter = 'i';

        switch (letter) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'o':
            case 'u':
                System.out.println("Bold vowel.");
                break;
            default:
                System.out.println("Not bold vowel.");
        }
    }
}
