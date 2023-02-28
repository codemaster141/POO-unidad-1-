/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete1;

import Paquete2.ClaseE;

/**
 *
 * @author Usuario
 */
public class ClaseC {
    public int publicC;
    int defaultC;
    private int privateC;
    
    public void prueba(){
        ClaseA objA = new ClaseA();
       // objA.publicA; atributos visibles
       //objA.defaultA;
       
         ClaseB objB = new ClaseB();
        //objB.publicB; atributos visibles
        //objB.defaultB; 
        
        ClaseD objD = new  ClaseD();
       // objD.publicD; atributos visibles
       //objD.defaultD;
       
       //Clase E esta en otro paquet y archivo
       //hay que agregar la clausula  "import"
        ClaseE objE = new ClaseE();
       //objE.publicE. solo el aributo publico
    }
    
}

class ClaseD{
    public int publicD;
    int defaultD;
    private int privateD;
}