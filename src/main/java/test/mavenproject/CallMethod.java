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
public class CallMethod {

    void showMessage() {
        System.out.println("This is Person class");
    }
}

class Add extends CallMethod {

   
    @java.lang.Override
    void showMessage() {
        System.out.println("This is Demo Class");
    }

    public static void main(String[] args) {
        Add a = new Add();
        a.showMessage(); // demo class method call
        CallMethod M = new CallMethod();
        M.showMessage(); // person class method call
    }
}
