/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gotcha
 */
import Herencia.CuentaAhorro;
import Test.TestClass;

public class Patito {
    public static void main(String[] args) {
        System.out.println("HOLA MUNDO");
        String x = "yo";
        TestClass tc = new TestClass(1,x);
        CuentaAhorro ca = new CuentaAhorro(1,"Lilian",0.03);
        //ca.saldo = 33;
    }
}
