
package test.mavenproject;

import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;

/**
 *
 * @author Bharti
 */

 public class Data2 {
    void sum(int a, int b){
System.out.println("Sum is " + (a+b));
}
void sum(double a, double b)
{
System.out.println("Sum is " + (a+b));
}
}
class Demo7 {
public static void main(String[] args) {
Person p = new Person();
p.sum(10, 20);
p.sum(10, 20);
}

}
