/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_2_clases_java;

/**
 * @author luis
 */
public class EVA1_2_CLASES_JAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // clase es la receta
        //objeto es el platillo
        //instalacion
        //1. declara la identificador para el objeto
        //2. asignar memoria con new
        //3.invocar
        //persona();-- constructor
        //cosntructor -- método
        Persona perso1 = new Persona();
        //System.out.print(perso1);
        //el punto nos deja ir a lo disponible en el objeto
        /*esta seccion es porque iniciamos los
        atributos con odificador default
        perso1.nombre = "luis";
        perso1.apellido = "meza";
        perso1.edad = 18;
        perso1.estadoCivil = true;// True -- casado;
        System.out.println(personal.nombre)*/
        
        perso1.setNombre("luis");
        perso1.setApellido("meza");
        perso1.setEdad(18);
        perso1.setEstadoCIvil(false);

        /*
        System.out.println(perso1.getNombre());
        System.out.println(perso1.getApellido());
        System.out.println(perso1.getEdad());
        System.out.println(perso1.getEstadoCivil());
        */
        perso1.imprimirDatos();
        System.out.println(" ");
        
        
        //persona 2
        //"new" es para crar otro objeto
        Persona perso2 = new Persona();
        
        perso2.setNombre("iram");
        perso2.setApellido("david");
        perso2.setEdad(1080);
        perso2.setEstadoCIvil(true);
        
        perso2.imprimirDatos();
        //acostumbrate a escribir todo,no seas flojo¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡
    }
}

