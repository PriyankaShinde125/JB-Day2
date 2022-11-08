package org.example;

import java.util.Scanner;

public class IfElseStmt {
    private int number;
    Scanner sc;

    public IfElseStmt() {
        sc = new Scanner(System.in);
    }

    public void numberToWord() {
        System.out.println("Enter single digit number");
        number = sc.nextInt();
        if (number == 0)
            System.out.println("Zero");
        else if (number == 1)
            System.out.println("one");
        else if (number == 2)
            System.out.println("Two");
        else if (number == 3)
            System.out.println("Three");
        else if (number == 4)
            System.out.println("Four");
        else if (number == 5)
            System.out.println("Five");
        else if (number == 6)
            System.out.println("Six");
        else if (number == 7)
            System.out.println("Seven");
        else if (number == 8)
            System.out.println("Eight");
        else if (number == 9)
            System.out.println("Nine");
        else
            System.out.println("Invalid input");
    }

    public void displayUnit() {
        String unit = null;
        System.out.println("Enter number");
        number = sc.nextInt();
        if (number == 1)
            unit = "Unit";
        else if (number == 10)
            unit = "Ten";
        else if (number == 100)
            unit = "Hundred";
        else if (number == 1000)
            unit = "Thousand";
        System.out.println(unit);
    }

}
