/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_3_constructores;

/**
 * @author luis meza
 */
public class CuentaBancaria {
    private String NumeroCuenta;
    private Double Saldo;
    private String Cliente;
    //constructores
    //se llaman igual que la clase
    //existen el default y con argumentos
    public CuentaBancaria(){//constructor default
        //inicializar valores
        // en este caso para crear una cuenta desde 0(datos vacios)
        NumeroCuenta = "----------";
        Saldo = .0 ;
        Cliente = "---------- ";
    }
    public CuentaBancaria(String nCuenta, double otroSaldo, String nCliente){
        NumeroCuenta = nCuenta;
        Saldo = otroSaldo;
        Cliente = nCliente;
    }
    
 //get //resivimos un dato
 public String getNueroDeCuenta(){
     return NumeroCuenta;//siempre es obligatorio el return
 }
 public double getSaldo(){
     return Saldo;
 }
 public String getCliente(){
     return Cliente;
 }

 //set//lo que resivimos en valor lo lanzamos 
 public void setNumeroDeCuenta(String valor){ //void no regresa un valor,es basio
     NumeroCuenta = valor;
 }
 //no importa que se llame valor mientra sea la misma variable
 public void setSaldo(double x){
     Saldo = x;
 }
 public void setCliente(String valor){
     Cliente = valor;
 }
}
 

   