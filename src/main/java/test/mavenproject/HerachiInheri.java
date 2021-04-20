package test.mavenproject;

/**
 *
 * @author Bharti
 */
public class HerachiInheri {

   

        void showInfo() {
            System.out.println("This is Herachi class method");
        }
    }

    class Person1 extends HerachiInheri {

        void showWarning() {
            System.out.println("This is Person class method");
        }

    void sum(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void sum(int i, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }

    class People1 extends HerachiInheri {

        void showSuccess() {
            System.out.println("This is People class method");
        }
    }

    class Deta3 extends Person1 {

        public static void main(String args[]) {
            People1 people1 = new People1();
            people1.showSuccess();
            people1.showInfo();
        }
    }
