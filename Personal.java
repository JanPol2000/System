abstract class Personal{
   private int clave;
   private String nombre;
   private int a�oIngreso;
   
   public Personal(){}
   
   public Personal(int clave, String nombre, int a�oIngreso){
      this.clave = clave;
      this.nombre = nombre;
      this.a�oIngreso = a�oIngreso;
   }
   
   public void setClave(int clave){
      this.clave = clave;
   }
   
   public void setNombre(String nombre){
      this.nombre = nombre;
   }
   
   public void setA�oIngreso(int a�oIngreso){
      this.a�oIngreso = a�oIngreso;
   }
   
   public int getClave(){
      return clave;
   }
   
   public String getNombre(){
      return nombre;
   }
   
   public int getA�oIngreso(){
      return a�oIngreso;   
   }
   
   abstract float calcularUtilidad();

}