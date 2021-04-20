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
public class Multi {

   

        
        void showInfo() {
            System.out.println("This is MultiLevel class method");
        }
    }

    class User1 extends Multi{

        void showWarning() {
            System.out.println("This is User class method");
        }
    }

    class People extends User1 {

        void showSuccess() {
            System.out.println("This is People class method");
        }
    }

    class Demo5 extends User1 {

        public static void main(String args[]) {
            People people = new People();
            people.showInfo();
            people.showWarning();
            people.showSuccess();
        }

    }
