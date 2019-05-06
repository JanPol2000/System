abstract class Personal{
   private int clave;
   private String nombre;
   private int añoIngreso;
   
   public Personal(){}
   
   public Personal(int clave, String nombre, int añoIngreso){
      this.clave = clave;
      this.nombre = nombre;
      this.añoIngreso = añoIngreso;
   }
   
   public void setClave(int clave){
      this.clave = clave;
   }
   
   public void setNombre(String nombre){
      this.nombre = nombre;
   }
   
   public void setAñoIngreso(int añoIngreso){
      this.añoIngreso = añoIngreso;
   }
   
   public int getClave(){
      return clave;
   }
   
   public String getNombre(){
      return nombre;
   }
   
   public int getAñoIngreso(){
      return añoIngreso;   
   }
   
   abstract float calcularUtilidad();

}