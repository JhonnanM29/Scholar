
package javaapplication90;

import java.text.SimpleDateFormat;
import java.util.Date;


public class JavaApplication90 {

  
    
        
        public Edad calcularEdad (Edad birth) {
 
        Date d = new Date();
 
        SimpleDateFormat sdfDia = new SimpleDateFormat("dd");
        SimpleDateFormat sdfMes = new SimpleDateFormat("MM");
        SimpleDateFormat sdfAño = new SimpleDateFormat("yyyy");
 
        int a = Integer.parseInt(sdfAño.format(d)) - Integer.parseInt(sdfAño.format(birth));
        int b = Integer.parseInt(sdfMes.format(d)) - Integer.parseInt(sdfMes.format(birth));
        int c = Integer.parseInt(sdfDia.format(d)) - Integer.parseInt(sdfDia.format(birth));
 
        if (b < 0) {
            a = a -1;
            b = 12 + b;
        }
 
        if (c < 0) {
            b = b - 1;
            switch (Integer.parseInt(sdfMes.format(d))) {
                case 2:
                    int año = Integer.parseInt(sdfAño.format(d));
                    if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0)))
                        c = 29 + c;
                    else
                        c = 28 + c;
                    break;
                case 4:
                case 6:
                case 9:
                case 10:
                case 11: c = 30 + c;
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 12: c = 31 + c;
                    break;
            }
        }
 
        Edad edad = new Edad();
        edad.setDay(c);
        edad.setMonth(b);
        edad.setYear(a);
 
        return edad;
        
        
        
        
      
    }

    private static class Edad {

        public Edad() {
        }

        private void setDay(int c) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void setYear(int a) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void setMonth(int b) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
}
