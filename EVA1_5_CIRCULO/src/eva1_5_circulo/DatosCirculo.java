/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_5_circulo;

/**
 *
 * @author Usuario
 */
public class DatosCirculo {
    // sacar el area y perimetro de un circulo
    //math es una clase especial con utilerias
    private double Area;
    private double Perimetro;
    private double Radio;
    //necesito tomar los datos mediante el radio
    //esto para despues estalecer cada operacion y lanzar su resutado
    
    public double getRadio(){
        return Radio;
    }
    public void setRadio(double valor){
        Radio = valor;
        
    }
    public double getArea(){
        return Math.PI * (Radio * Radio);
    }
    public double getPerimetro(){
        return Math.PI * (Radio * 2);
    }
    
    public DatosCirculo(){
        Radio = 16;
        
    }

}
