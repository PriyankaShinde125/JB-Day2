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
        number=sc.nextInt();
        while (i <= number)
        {
            sum=sum+i;
            i++;
        }
        System.out.println("Sum of first" +number+" natural number is "+sum);
    }
}
