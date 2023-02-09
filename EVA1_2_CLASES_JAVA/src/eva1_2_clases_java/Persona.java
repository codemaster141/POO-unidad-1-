/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_2_clases_java;

/**
 *
 * @author Usuario
 */
public class Persona {
    //atributos de la clase
   private String nombre; //string es para texto
   private  String apellido;
   private  int edad; //int se utiliza para numeros enteros,solo enteros,tambien los negativos
   /*  en lugar de int puede ser
   floate es para decimales pequeños
   double es para decimales grandes 
   */
   private  boolean estadoCivil;//es true o false
    //METODOS: COMPORTAMIENTO
    //nombres no tan largos,cre tu estilo bro,aprende un estilo y cambialo a tu 
 
    //lectura y escritura de atributos
    //metodos get -- leer, método set -- escribir 
    //metodos:
    //modificador valor de retono nombre (argumentos)(implementacion)
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String valor){
        nombre = valor;
    }
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String valor){
        apellido = valor;
    }
    public int getEdad(){
        return edad;
    } 
    public void setEdad(int valor){
        edad = valor;
    }
    public boolean getEstadoCivil(){
        return estadoCivil;
    }
    public void setEstadoCIvil(boolean valor){
        estadoCivil = valor;
    }
    public void imprimirDatos(){
        System.out.println("datos almacenados:");
                //concatenacióm
                //+ suma (numeros) + concantena -- sobre
        
        System.out.println("nombre completo: " + nombre + " " + apellido + " " + "estas mamadisimo");
        System.out.println("edad: " + edad + " tan joben y hermoso");
        if(estadoCivil)
            System.out.println("Estado Civil: casado y feliz");
        else
            System.out.println("Estado Civil: soltero y de fiesta");
    }
}
 