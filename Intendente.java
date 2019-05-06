public class Intendente extends Personal{
   private String area;
   private int nivel;
   
   public Intendente(){}
   
   public Intendente(int clave, String nombre, int añoIngreso, String area, int nivel){
      super(clave, nombre, añoIngreso);
      this.area = area;
      this.nivel = nivel;
   }
   
   public void setArea(String area){
      this.area = area;
   }
   
   public String getArea(){
      return area;
   }
   
   public void setNivel(int nivel){
      this.nivel = nivel;
   }
   
   public int getNivel(){
      return nivel;
   }
   
   public float  calcularUtilidad(){
   String v = "Esto es un cambio";
   return 1;
   }
}