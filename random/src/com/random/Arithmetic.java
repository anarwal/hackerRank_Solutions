package com.random;

/**
 * Created by abhimanyunarwal on 2/9/17.
 */
import java.util.*;
import java.math.*;

public class Arithmetic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();

        double divisor=100;
        // Write your calculation code here.
        double divide = tipPercent/divisor;
        double tip= mealCost * divide;
        System.out.println(tip);
        double tax=mealCost*(taxPercent/divisor);
        System.out.println(tax);


        // cast the result of the rounding operation to an int and save it as totalCost
        int totalCost = (int) Math.round(mealCost+tip+tax);

        System.out.println(totalCost);

        // Print your result
    }
}
