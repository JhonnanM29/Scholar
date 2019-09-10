
package javaapplication88;


public class JavaApplication88 {

   
    public static void main(String[] args) {
        
        
 import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

// 01/01/2000
DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
LocalDate fechaNac = LocalDate.parse("15/08/1993", fmt);
LocalDate ahora = LocalDate.now();

Period periodo = Period.between(fechaNac, ahora);
System.out.printf("Tu edad es: %s años, %s meses y %s días",
                    periodo.getYears(), periodo.getMonths(), periodo.getDays());
        
    }
    
}
