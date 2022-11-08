package org.example;

import java.util.Scanner;

public class Operators {
    int a, b, c;
    int result1, result2, result3, result4;
    Scanner sc;
    String exprForMaxResult = null;
    String exprForMinResult = null;

    public void evaluateAndFindMinMax() {
        System.out.println("Enter three numbers  a b c");
        sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        result1 = a + b * c;
        result2 = c + a / b;
        result3 = a % b + c;
        result4 = a * b + c;
        System.out.println("Max Result is " + max(result1, result2, result3, result4) + " for " + exprForMaxResult);
        System.out.println("Min result is " + min(result1, result2, result3, result4) + " for " + exprForMinResult);

    }

    public int max(int result1, int result2, int result3, int result4) {
        int max = result1;
        exprForMaxResult = "a + b * c";
        if (result2 > max) {
            max = result2;
            exprForMaxResult = "c + a / b";
        }
        if (result3 > max) {
            max = result3;
            exprForMaxResult = "a % b + c";
        }
        if (result4 > max) {
            max = result4;
            exprForMaxResult = "a * b + c";
        }
        return max;
    }

    public int min(int result1, int result2, int result3, int result4) {
        int min = result1;
        exprForMinResult = "a + b * c";
        if (result2 < min) {
            min = result2;
            exprForMinResult = "c + a / b";
        }
        if (result3 < min) {
            min = result3;
            exprForMinResult = "a % b + c";
        }
        if (result4 < min) {
            min = result4;
            exprForMinResult = "a * b + c";
        }
        return min;
    }

    public void rootsOfQuadraticEq() {
        System.out.println("Enter three numbers  a b c");
        sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            double root1 = ((-b + Math.sqrt(delta)) / (2 * a));
            double root2 = ((-b - Math.sqrt(delta)) / (2 * a));
            System.out.format("Root1 = %.2f and Root2 = %.2f", root1, root2);
        } else if (delta == 0) {
            double root1 = -b / (2.0 * a);
            System.out.println("Roots are equal. Root1=Root2= " + root1);
        } else System.out.println("Roots not real");
    }
}
