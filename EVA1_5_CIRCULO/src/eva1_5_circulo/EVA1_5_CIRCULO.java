/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_5_circulo;

/**
 *
 * luis carlos,225502999
 */
public class EVA1_5_CIRCULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DatosCirculo circu1 = new DatosCirculo();
        
        circu1.setRadio(2);
        System.out.println("area: " + circu1.getArea());
        System.out.println("perimetro: " + circu1.getPerimetro());
    }
    
}
