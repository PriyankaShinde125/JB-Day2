package org.example;

import java.util.Scanner;

public class Loops {
    Scanner sc;
    int number;

    public Loops() {
        sc = new Scanner(System.in);
    }

    public void sumWithWhileLoop() {
        int sum = 0;
        int i = 0;
        System.out.println("Enter a natural number");
        number = sc.nextInt();
        while (i <= number) {
            sum = sum + i;
            i++;
        }
        System.out.println("Sum of first" + number + " natural number is " + sum);
    }

    public void reverseNoWithWhileLoop() {
        int reverse = 0, reminder;
        System.out.println("Enter number to reverse");
        number = sc.nextInt();
        while (number > 0) {
            reminder = number % 10;
            reverse = reverse * 10 + reminder;
            number = number / 10;
        }
        System.out.println("Reverse number is " + reverse);
    }

    public void sumWithForLoop() {
        int sum = 0;
        int i = 0;
        System.out.println("Enter a natural number");
        number = sc.nextInt();
        for (i = 0; i <= number; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of first" + number + " natural number is " + sum);
    }

    public void reverseNoWithForLoop() {
        int reverse = 0, reminder;
        System.out.println("Enter number to reverse");
        number = sc.nextInt();
        for (int i=number;i>0;i=i/10) {
            reminder = i % 10;
            reverse = reverse * 10 + reminder;
        }
        System.out.println("Reverse number is " + reverse);
    }
}
