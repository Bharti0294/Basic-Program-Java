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
public class Override {
    
int getRateOfInterest() {
return 0;
}
}
class SBI extends Override {
@java.lang.Override
int getRateOfInterest() {
return 8;
}
}
class ICICI extends Override {
@java.lang.Override
int getRateOfInterest() {
return 7;
}
}
class Dist {
public static void main(String args[]) {
SBI s = new SBI();
ICICI i = new ICICI();
System.out.println("SBI Rate of Interest: " + s.getRateOfInterest());
System.out.println("ICICI Rate of Interest: " + i.getRateOfInterest());
}

}
