import java.util.Calendar;
import java.util.Scanner;
public class Prueba{
   public static void main(String args[]){
      Calendar cal = Calendar.getInstance();
      int a�o = cal.get(Calendar.YEAR);
      Scanner entrada = new Scanner(System.in);
      
      int a = entrada.nextInt();
      
      int a�oAnt = a�o - a;
      
      System.out.println("Los a�os de antiguedad son: " + a�oAnt);
      
   }
}