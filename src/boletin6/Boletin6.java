/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6;

/**
 *
 * @author Ricky
 */
public class Boletin6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta();
        cuenta1.setNumCuenta(11111111);
        cuenta1.setNombre("Enrique");
        cuenta1.setSaldo(1100);
        cuenta1.ingreso(100);
        cuenta1.reintegro(50);
        cuenta1.visualizar();
        
        
        Cuenta cuenta2 = new Cuenta();
        cuenta2.setNumCuenta(22222222);
        cuenta2.setNombre("Santiago");
        cuenta2.setSaldo(1500);
        cuenta2.ingreso(300);
        cuenta2.reintegro(2000);
        cuenta2.visualizar();
        
        cuenta2.transferencia(cuenta1, 100);
        cuenta1.visualizar();
        cuenta2.visualizar();
    }
    
}
