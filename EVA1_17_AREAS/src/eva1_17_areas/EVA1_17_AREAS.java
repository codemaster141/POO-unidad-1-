
package eva1_17_areas;

/**
 *
 * @author luis C.
 */
public class EVA1_17_AREAS {


    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("area triangulo: " + areas(5.0, 5.0));
        System.out.println("area circulo: " + areas(3.0));
        System.out.println("area  trapecio: " + areas(3.0, 3.0 ,3.0));
    }
    public static double areas (double radio){
        return  Math.PI * (radio * radio);
    }
    public static double areas (double base, double altura ){
        return (base * altura) / 2.0;
    }
    public static double areas (double altura, double B, double b){
        return altura * (B  + b)  / 2;
    }
}
