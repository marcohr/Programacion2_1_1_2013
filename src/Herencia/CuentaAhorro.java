/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author Gotcha
 */
public class CuentaAhorro extends CuentaBancaria{
    private double tasa;
    
    public CuentaAhorro(int n, String c, double ta){
        super(n, c);
        tasa = ta;
        saldo = 500;
    }

    public void setTasa(double ta){
        tasa = ta;
    }
    
    public double getTasa() {
        return tasa;
    }
    
    public void registrarIntereses(){
        deposito( saldo * tasa );
    }

    @Override
    public String toString() {
        return "CuentaAhorro{" + super.toString() +"tasa=" + tasa + '}';
    }
        
    @Override
    public void patito() {
        System.out.println("SOY EL PATO HIJO LLAMADO AHORRO");
        //super.patito();
    }
    
    
}
