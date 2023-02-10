/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_3_constructores;

/**
 *
 * @luis carlso
 */
public class EVA1_3_constructores {

/* LOS CONSTRUCTORES SON UN METODO
    TODAS LAS CLASES TIENEN UN CONSTRUCTOR
    SE USARIAN PARA INICIALIZAR LOS ATRIBUTOS DE UN OBJETO
    ES LO PRIMERO QUE SE VA A EJECUAR
    */
    public static void main(String[] args) {
   
        CuentaBancaria BBVA  = new CuentaBancaria("22550299", 100.5, "luisC");
        
        //es un metodo --CuentaBancaria()-- constructor
       /* BBVA.setCliente("LUIS MEZA");
        BBVA.setNumeroDeCuenta("22550299");
        BBVA.setSaldo(.1);*/
        
        System.out.println("DATOS DEL CLIENTE:");
        String Clientitos= BBVA.getCliente();
        System.out.println(Clientitos);
        String NumeroCuentaB = BBVA.getNueroDeCuenta();
        System.out.println(NumeroCuentaB);
        double fSaldo = BBVA.getSaldo();
        System.out.println(fSaldo);
       
        //-----------------------------------------------
        
        CuentaBancaria SANTANDER = new CuentaBancaria("19040686", 200.5, "angel");
        System.out.println("DATOS DEL CLIENTE");
        System.out.println(SANTANDER.getCliente());
        System.out.println(SANTANDER.getNueroDeCuenta());
        System.out.println(SANTANDER.getSaldo());
        
        //-----------------------------------------------
        
        CuentaBancaria BANCOMER = new CuentaBancaria(); 
        System.out.println("DATOS DEL CLIENTE");
        System.out.println(BANCOMER.getCliente());
        System.out.println(BANCOMER.getNueroDeCuenta());
        System.out.println(BANCOMER.getSaldo());
        
        
    }

}
