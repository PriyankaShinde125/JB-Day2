package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1 If_Else statement
        IfElseStmt ifElseStmtObj = new IfElseStmt();
        //1.1 Number to word
        ifElseStmtObj.numberToWord();
        //1.2 Display Unit
        ifElseStmtObj.displayUnit();

        //2 Loops
        Loops loopsObj = new Loops();
        loopsObj.sumWithWhileLoop();
        loopsObj.reverseNoWithWhileLoop();
        loopsObj.sumWithForLoop();
        int number = 12345;
        System.out.println(loopsObj.reverseNoWithForLoop(number));
        loopsObj.checkPalindromeWithForLoop();

        //3 Switch Statement
        SwitchStmt switchStmtObj = new SwitchStmt();
        switchStmtObj.isVowelOrConsonant();
        switchStmtObj.getMonthNameFromNumber();
        //4 Operators
        Operators operatorsObj = new Operators();
        operatorsObj.evaluateAndFindMinMax();
        operatorsObj.rootsOfQuadraticEq();

    }

}