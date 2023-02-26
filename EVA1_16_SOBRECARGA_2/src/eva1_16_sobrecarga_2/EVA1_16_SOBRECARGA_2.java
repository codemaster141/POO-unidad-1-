/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_16_sobrecarga_2;

/**
 *
 * @author Usuario
 */
public class EVA1_16_SOBRECARGA_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("suma: " + suma(4,5));
          System.out.println("suma: " + suma(4.0,5.0));
          System.out.println("suma: " + suma("hola ","mundo!!"));
          suma();
    }
    //suma (int , int)
    public static int suma (int val1, int val2) {
        return val1 + val2;
    }
    //suma (double ,  double)
      public static double suma (double val1, double val2) {
        return val1 + val2;
    }
       //suma (string , string)
      public static String suma (String val1, String val2) {
        return val1 + val2;
    }
      //suma
      public static void suma(){
          System.out.println("metodos sin parametros suma");
      }
}
