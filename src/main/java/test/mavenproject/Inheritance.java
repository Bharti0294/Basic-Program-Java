
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
public class Inheritance {



        int age = 65;
    }

    class Data extends Inheritance {

        int salary = 20000;

        public static void main(String args[]) {
            Data d = new Data();
            System.out.println(d.age);
            System.out.println(d.salary);
        }
    }

