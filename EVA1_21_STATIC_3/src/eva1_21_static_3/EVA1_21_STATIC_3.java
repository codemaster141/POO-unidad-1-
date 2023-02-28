/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_21_static_3;

/**
 *
 * @author Usuario
 */
public class EVA1_21_STATIC_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(Prueba.valor);
        Prueba.valor++;
        System.out.println(Prueba.valor);
        System.out.println("AHORA CON OBJETOS");
        PruebaObjetos obj = new PruebaObjetos();
        System.out.println(obj.valor);
        obj.valor++;
        PruebaObjetos obj2 = new PruebaObjetos();
        System.out.println(obj2.valor);
    }
    
}
class Prueba{
    public static int valor = 100;
}
class PruebaObjetos{
    public  int valor = 100;
}