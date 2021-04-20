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
public class Single {

   

        void showMessage() {
            System.out.println("This is single class");
        }
    }

    class User extends Single {

        int age = 65;
    }

    class Data1 extends User {

        public static void main(String args[]) {
            User U = new User();
            U.showMessage();
            System.out.println(U.age);
        }

    }
