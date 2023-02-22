/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_12_califas;

/**
 *
 * @author Usuario
 */
public class EVA1_12_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String resu;
    resu = Califas (85);
        System.out.println("calificacion de 85: " + resu);
        System.out.println("calificacion de 70: " + Califas(70));
        Califas (100);
    
    }
    public static String Califas (int califa){
       String resu;
        if ((califa >= 91)  && (califa <=100)){
          resu ="A";
         } else  if ((califa >=81 ) && (califa <=90 )) {
          resu = "B";
         } else  if ((califa >=71 ) && ( califa <=80 )) {
          resu = "C";
         } else {
          resu = "D";
    }
         return resu;
    }
}    
   
