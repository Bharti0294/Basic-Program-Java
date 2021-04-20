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
public class Method {
    void showMessage(){
System.out.println("This is Method class");
}
}
class Docu extends Method {

 void showMessage(){
System.out.println("This is Docu Class");
}
public static void main(String[] args) {
Docu d = new Docu();
d.showMessage(); // demo class method call
Method m = new Method();
m.showMessage(); // person class method call
}

}
