
package scholar;

import java.util.Scanner;
public class Scholar {

    
    public static void main(String[] args) {
        
        Scanner lectura=new Scanner(System.in);
    int año_nacimiento;
    int año_actual;
        
        Empleado empleado1 = new Empleado();
        
        empleado1.nombre= "Jhonnan Esmid";
        empleado1.apellido="Martinez Luquez";
        
        System.out.println(" Digite año de nacimiento ");
        año_nacimiento=lectura.nextInt();
        
        System.out.println("digite año actual");
          
        año_actual=lectura.nextInt();
                
        int Edad = año_actual-año_nacimiento;
        System.out.println("tu edad es"+Edad);
       
        
              
        
       
        
        //System.out.println("El empleado se llama "+empleado1.nombre);
        //System.out.println("El apellido del empleado es "+empleado1.apellido);
        //System.out.println("El numero de identificacion es "+empleado1.identificacion);
        //System.out.println("La fecha de nacimiento es  "+empleado1.fecha_nacimiento);
        //System.out.println("El genero es "+empleado1.genero);
        //System.out.println("La direccion del empleado es "+empleado1.direccion);
        //System.out.println("La direccion del empleado es "+empleado1.correo_electronico);
        
        Estudiante estudiante1 = new Estudiante();
        
        estudiante1.nombre= " Jhonnan Esmid ";
        estudiante1.apellido= " Martinez Luquez ";
        
        empleado1.printname();
        
        //System.out.println(" EL nombre del estudiante es "+estudiante1.nombre);
        //System.out.println(" El apellido del estudiante es "+estudiante1.apellido);
        
       
     
        
        
         
        
        
        
        
        
        
        
        
        
        
    }
    
}
