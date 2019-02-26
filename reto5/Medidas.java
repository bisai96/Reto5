
package reto5;

import java.io.*;
import java.util.Scanner;
public class Medidas{
       public static void main( String args[] ){
       Scanner leer = new Scanner(System.in);
       
       int num = 0;
       String bin;
 
      /* double decimal_binario;
       double decimal_octal;
       double decimal_hexadecimal;
       double binario_decimal;
       double octal_decimal;
       double hexadecimal_decimal;*/
       String RES,sino;
       boolean continuar = true;
       while(continuar){
 
       System.out.println( "Ingrese la operacion" );
       System.out.println( "1.- Decimal a binario" );
       System.out.println( "2.- Decimal a octal" );
       System.out.println( "3.- Decimal a hexadecimal" );
       System.out.println( "4.- Binario a decimal");
       System.out.println( "5.- Octal a decimal");
       System.out.println( "6.- Hexadecimal a decimal");
       System.out.println( "\n" );
           int op = leer.nextInt();
           leer.nextLine();
 
       switch (op){
                   case 1:
                          System.out.println( " Decimal a binario" );
                          System.out.println( "Ingrese el numero: " );
                          num = leer.nextInt();
                          leer.nextLine();
                          bin = Integer.toBinaryString(num);
                          RES = bin;
                          System.out.println( "El resultado es: "+RES );
                          break;
                   case 2:
                          System.out.println( " Decimal a octal" );
                          System.out.println( "Ingrese el numero: " );
                          num = leer.nextInt();
                          leer.nextLine();
                          bin = Integer.toOctalString(num);
                          RES = bin;
                          System.out.println( "El resultado es: "+RES );
                          break;
                   case 3:
                          System.out.println( " Decimal a hexadecimal" );
                          System.out.println( "Ingrese el numero:" );
                          num = leer.nextInt();
                          leer.nextLine();
                          bin = Integer.toHexString(num);
                          RES = bin;
                          System.out.println( "El resultado es: "+RES );
                          break;
                    case 4:
                          System.out.println( " Binario a decimal" );
                          System.out.println( "Ingrese el numero: " );
                          bin = leer.nextLine();
                          num = Integer.parseInt(bin,2);
                          System.out.println( "El resultado es: "+num );
                          break;
                   case 5:
                          System.out.println( " Octal a decimal " );
                          System.out.println( "Ingrese el numero: " );
                          bin = leer.nextLine();
                          num = Integer.parseInt(bin,8);
                          System.out.println( "El resultado es: "+num );
                          break;
                   case 6:
                          System.out.println( " Hexadecimal a decimal " );
                          System.out.println( "Ingrese el numero:" );
                          bin = leer.nextLine();
                          num = Integer.parseInt(bin,16);
                          System.out.println( "El resultado es: "+num );
                          break;
                   
                         
                       
                       
                  }
           System.out.println("¿Desea realizar otra conversion(s/n)?");
           sino = leer.nextLine();
           
           if("n".equals(sino)){
               continuar = false;
           }else{
               continuar = true;
           }
       }
}


     public static double CalcularHipotenusa(double ladA, double ladB){
     return Math.sqrt(ladA*ladA+ladB*ladB);
     }
     
     private static boolean ladoPositivo(double lado){
         return lado >0;
     }

}
