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
public class MultiCons {

    MultiCons() {
        System.out.println("This is default constructor of Persn class");
    }

    MultiCons(int age, String name) {
        System.out.println("Your age is " + age + " and Your name is " + name);
    }
}

class Team {

    public static void main(String args[]) {
        MultiCons p = new MultiCons();
        MultiCons p1 = new MultiCons(27, "Bharti");
    }

}
