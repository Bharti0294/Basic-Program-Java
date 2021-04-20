
package test.mavenproject;

/**
 *
 * @author Bharti
 */
public class Test {
    void sum(int a, int b) {
        int c = a + b;
        System.out.println("Sum is " + c);
    }

    void sum(int a, int b, int c) {
     
    int
        d = a+b+c;
        System.out.println("Sum is " + d);
    }
}

 class Demo6 {

    public static void main(String args[]) {
        Person x = new Person();
        x.sum(10, 20);
        x.sum(10, 20, 30);
    }
}
