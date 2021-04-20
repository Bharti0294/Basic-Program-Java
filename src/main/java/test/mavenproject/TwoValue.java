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
public class TwoValue {

    TwoValue(int age, String name) {
        System.out.println("Your age is " + age + " and Your name is " + name);
}
}
class Value {

    public static void main(String args[]) {
        TwoValue t = new TwoValue(27, "Bharti");
    }

}
