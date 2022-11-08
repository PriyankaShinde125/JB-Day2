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

    public void getMonthNameFromNumber() {
        System.out.println("Enter a month number :");
        sc = new Scanner(System.in);
        int monthNumber = sc.nextInt();
        String monthName = null;
        switch (monthNumber) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
        System.out.println(monthName);
    }
}
