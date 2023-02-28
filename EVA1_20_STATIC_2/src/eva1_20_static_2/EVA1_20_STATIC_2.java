/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_20_static_2;

/**
 *
 * @author Usuario
 */
public class EVA1_20_STATIC_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* final int x;
        x = 100;
        x = 200;*/
       FormulasGeometria formulas = new FormulasGeometria();
       //formulas.no exixte ningun metodo dentro del objeto
        System.out.println("MI PI: " + FormulasGeometria.PI);
        System.out.println("area triangulo: " +  FormulasGeometria.areaTriangulo(7, 9));
        System.out.println("volumen esfera: " + FormulasGeometria.volumenEsfera(9));

    }
    
}
