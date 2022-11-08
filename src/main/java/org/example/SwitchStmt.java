package org.example;

import java.util.Scanner;

import static java.lang.Character.toLowerCase;

public class SwitchStmt {

    Scanner sc;

    public void isVowelOrConsonant() {
        System.out.println("Enter a alphabet :");
        sc = new Scanner(System.in);
        char alphabet = sc.next().charAt(0);
        toLowerCase(alphabet);
        boolean isVowel;
        switch (alphabet) {
            case 'a':
                isVowel = true;
                break;
            case 'e':
                isVowel = true;
                break;
            case 'i':
                isVowel = true;
                break;
            case 'o':
                isVowel = true;
                break;
            case 'u':
                isVowel = true;
                break;
            default:
                isVowel = false;
                break;
        }
        if (isVowel)
            System.out.println("It is vowel");
        else System.out.println("It is Consonant");
    }
}
