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
public class Cuenta {
    private String nombre;
    private int numCuenta, saldo;
    
    public Cuenta(){
        
    }
    
    public Cuenta(String nombre, int numCuenta,int saldo){
        this.nombre = nombre;
        this.numCuenta = numCuenta;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getNumCuenta() {
        return numCuenta;
    }
    
    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }
    
    public int getSaldo() {
        return saldo;
    }
    
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    public void ingreso(int dinero){
        if (dinero > 0){
        saldo+=dinero;        
        }
        else{
            System.out.println("Ingreso negativo"); 
        }      
    }
    
     public void reintegro(int dinero){
        if (saldo>dinero){
            saldo-=dinero;
            System.out.println(nombre + " hizo el reintegro con exito");
        }
        else{
            System.out.println(nombre + " no tiene dinero suficiente para reintegro");
        }
    }
    
    public void visualizar(){
        System.out.println("El nombre del cliente es: " + nombre + " el numero de cuenta es: "+ numCuenta + " y el saldo es: " + saldo);
    }
    
    public void transferencia(Cuenta cuenta2, int dinero) {
        cuenta2.setSaldo(dinero + cuenta2.getSaldo());
        saldo -= dinero;           
    }
}
