import java.util.Calendar;
import java.util.Scanner;
public class Prueba{
   public static void main(String args[]){
      Calendar cal = Calendar.getInstance();
      int año = cal.get(Calendar.YEAR);
      Scanner entrada = new Scanner(System.in);
      
      int a = entrada.nextInt();
      
      int añoAnt = año - a;
      
      System.out.println("Los años de antiguedad son: " + añoAnt);
      
   }
}