
package eva1_18_sobrecargarfc;

/**
 *
 * @author Usuario
 */
public class EVA1_18_sobrecargaRFC {

    public static void main(String[] args) {
        // TODO code application logic here
        String rfc = generarRFC("Luis ", "Meza ", "López ", 2004 , 9 , 18 );
        System.out.println(rfc);
    }
    public static String  generarRFC(String nombre, String apPat, String apMat, int año, int mes, int días ){
        String apP1 = apPat.charAt(0) + "";
        String apP2 = apPat.charAt(1) + "";
        String apM = apMat.charAt(0) + "";
        String nom = nombre.charAt(0) + "";
        String rfc = apP1 + apP2+ apM + nom + año + mes + días + "";
               return rfc;
    }
}
