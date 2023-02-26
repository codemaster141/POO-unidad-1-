/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_13_alcance;

/**
 *
 * @author Usuario
 */
public class EVA1_13_ALCANCE {

    /**
     * @param args the command line 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 100;//visible para todo lo que este dentro de main
        for  ( int  i = 0; i  < 10; i++) {//inicio del bloque for
            System.out.println("x= " + x); //visible dentro del for 
            System.out.println("i = " + i);
            System.out.println("j= " + j);//variable no es vista, no esta declarada la instruccion
            int j = 100;
            System.out.println("j= " + j);
        {
            int z =1000;
            System.out.println("z = " + z);
        }
        //termina bloque for
        System.out.println("z = " + z);
    }
        //no estan declaradas en el bloque main
          System.out.println("i = " + i);
            System.out.println("j= " + j);
        
    }
    public static void algo(){
        System.out.println("x= " + x);
    }
    } 