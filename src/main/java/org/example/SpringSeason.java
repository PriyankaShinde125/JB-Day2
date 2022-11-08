package org.example;

public class SpringSeason {
    public static void main(String[] args) {
        //d is for date and m is for month
        int d, m;
        boolean isSpringSeason = false;
        d = Integer.parseInt(args[0]);
        m = Integer.parseInt(args[1]);
        if ((d > 20 && m < 6 && m >= 3) || (d < 20 && m <= 6 && m > 3))
            isSpringSeason = true;
        else
            isSpringSeason = false;
        System.out.println(isSpringSeason);
    }
}
