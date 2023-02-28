/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_19_static;

/**
 *
 * @author Usuario
 */
public class EVA1_19_static {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//static es algo que podemos usar sin crear instancias de una clase
        
        // TODO code application logic here
        System.out.println("PI" + Math.PI);
        System.out.println("numero aleatoreo" + Math.random());
        Utilerias utileria = new Utilerias();
        utileria.Saludo();
        Utilerias.otroSaludo();
        Saludo2();//SI NIO ES ESTATICO, Y NO SE HA CREADO UN OBJETO, EL METODO NO EXISTE
    }
        public void Saludo2(){
            System.out.println("HOLA");
        }
    }
    
   class Utilerias{//ESTE METODO EXISTE HASTA QUE SE CREA UN OBJETO DE LA CLASE.SOLO SE USA A TRAVES DE UN OBJETO.
       public void Saludo(){
           System.out.println("Hola!!");
       }
       //otroSaludo() ; ESTE METODO EXISTE EN EL MOMENTO QUE EL PROGRAMA INICIA SU EJECUCION
       //NO NECESITA QUE SE CREE UN OBJETO DE LA CLASE PARA PODERLO UTILIZAR.
       //SE UASA TRAVEZ DE LA CLASE
       public static void otroSaludo(){
           System.out.println("Otro saludo (static)");
       }
}
