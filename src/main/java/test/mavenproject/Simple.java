/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.mavenproject;

/**
 *
 * @author Bharti
 */
import java.util.Scanner;

public class Simple {

    public static void main(String args[]) {
        float p, r, t, sinterest;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Principal :2000 ");
        p = scan.nextFloat();
        System.out.print("Enter the Rate of interest :6 ");
        r = scan.nextFloat();
        System.out.print("Enter the Time period : 3");
        t = scan.nextFloat();
        sinterest = (p * r * t) / 100;
        System.out.print("Simple Interest is: " + sinterest);
    }

}
