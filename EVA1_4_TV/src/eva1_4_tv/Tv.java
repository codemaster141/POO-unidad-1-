/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_4_tv;

/**
 *
 * @author Usuario
 */
public class Tv {
    private int volumen;
    private int canal;
    private boolean poder;
    
    //constructores
    public Tv(){//constructor default
        volumen = 0;
        canal = 0;
        poder = false;//apagado
    }
    
    //metodos psra pérar la TV (interfaz)
    //encender y apagar la TV
    public void cambiarEstadoPoder(){
        //verificar el estadp de la TV
        if(poder == true){
            poder = false;
        System.out.println("Apsgsdo psntalla");
    }else{
            poder = true;
            System.out.println("Encendido pantalla");

        } 
    }
    //voluven
    public void subirVolumen (){
        if(poder == true){//  if(poder)la Tv esta prendida
          if(volumen < 100){
        volumen = volumen + 1;//acumulador
        //volumen++;
        //volumen+=1;
        System.out.println("volumen: " + volumen);
          }
        }
    }
    public void bajarVolumen (){
        if(poder == true){
            if (volumen > 0){
        volumen = volumen - 1;//acumulador
        //volumen--;
        //volumen-=1;
         System.out.println("volumen: " + volumen);
            }
        }
    }
    public void subirCanal (){
        if(poder == true){
                canal = canal +1;
            if (canal > 100)
                 canal = 0;
            
            System.out.println("canal: " + canal);
        }
            
    }
    public void bajarCanal (){
        if(poder == true){
                canal = canal -1;
            if (canal < 0)
                    canal = 100;
             System.out.println("canal: " + canal);
        }
            
    }
}



