/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_6_automovil;

/**
 *
 * @author Usuario
 */
public class AUTO {
    
    private String Marca;
    private String Modelo;
    private int Año;
    private String Dueño;
    //constructor
    
    public AUTO () {
        Marca = "-------";
        Modelo = "-----";
        Año =  0 ;
        Dueño =  "--------";
        
    }
    public AUTO  (String marcaAuto, String modeloAuto, int añoAuto, String dueñoAuto){
            Marca = marcaAuto;
            Modelo = modeloAuto;
            Año = añoAuto;
            Dueño = dueñoAuto;
    }
    //----------------------------------------------------------------------------------------------------get
    public String getMarca (){
        return Marca;
    }
    public String getModelo (){
        return Modelo;
    }
    public int getAño (){
        return Año;
    }
    public String getDueño (){
        return Dueño;
    }
    //-------------------------------------------------------------------------------------------------set
    public void setMarca (String marcaAuto){
        Marca = marcaAuto;
    }
    public void setModelo (String modeloAuto){
        Modelo = modeloAuto;
    }
    public void setAño (int añoAuto){
        Año = añoAuto;
    }
    public void setDueño (String dueñoAuto){
        Dueño = dueñoAuto;
    }
    
    public int calcularRev () {
        int adeudo = 0;
        //if else anidado
        if (Año <= 2000) {
            adeudo = 1500;
        }else if ( (Año >= 2001)  && (Año <= 2005) ) {
            adeudo = 2000;
        }else if  ( (Año >= 2006)  && (Año <= 2010) ) {
            adeudo = 2500;
        }else if  ( (Año >= 2011)  && (Año <= 2015) ) {
            adeudo = 3000;
        }else {
            adeudo = 3500;
        }     
        return adeudo;
    }

    //imprimir datos
    public void lanzarDatos (){
        System.out.println("monto del adeudo; ");
        System.out.println("    ");
        
        System.out.println(" A Nombre De: " + Dueño);
        System.out.println( Marca  + "  " + Modelo );
        System.out.println("Año: " + Año);
        System.out.println("adeudo: " + calcularRev () );
    }
}
