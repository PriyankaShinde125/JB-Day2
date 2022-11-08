package org.example;

public class Distance {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double euclideanDistance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.format("Euclidean Distance is %.2f", euclideanDistance);
    }
}
