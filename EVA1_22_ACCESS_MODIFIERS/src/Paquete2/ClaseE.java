/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete2;

import Paquete1.ClaseA;
import Paquete1.ClaseC;


/**
 *
 * @author Usuario
 */
public class ClaseE {
    public int publicE;
    int defaultE;
    private int privateE;
    
      public void prueba(){
          
    ClaseA objA = new ClaseA();
    //objA.publicA;

    
    //ClaseB es invisible por ser clase default
    //y esta en otro paquete
    //ClaseB objB = new ClaseB();
    
    ClaseC objC = new ClaseC();
    //objC.publicC;
    
    //ClaseD es invisible por ser clase default
    //y esta en otro paquete
    //ClaseD objD = new ClaseD();
    
    ClaseF objF = new ClaseF();
    //objF.publicF;atributos visibles
    //objF.defaultF;
      }
}
class ClaseF{
    public int publicF;
    int defaultF;
    private int privateF;
}