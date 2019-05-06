import java.util.Calendar;
public class Profesor extends Personal{
   private String titulo;
   private String departamento;
   private int horas;
   Calendar cal= Calendar.getInstance();
   

   public Profesor(){}
   
   public Profesor(int clave, String nombre, int añoIngreso, String titulo, String departamento, int horas){
      super(clave, nombre, añoIngreso);   
      this.titulo = titulo;
      this.departamento = departamento;
      this.horas = horas;
   }
   
   public String getTitulo(){
   return titulo;
   }
   
   public void setTitulo(String titulo){
   this.titulo = titulo;
   }
   
   public String getDepartamento(){
   return departamento;
   }
   
   public void setDepartamento(String departamento){
   this.departamento = departamento;
   }
   
   public int getHoras(){
   return horas;
   }
   
   public void setHoras(int horas){
   this.horas = horas;
   }
   
   public float calcularUtilidad(){
   int year= cal.get(Calendar.YEAR);
   return 2;
   }
}