 
public class Alumno{
    
	private String nombre;
    	private String apellido;
        public Alumno (String nombre, String apellido){ 
        	this.nombre = nombre;
        	this.apellido = apellido;
    }
	public void setNombre(String nombre){
       		nombre = nombre;   
    }
        public String getNombre(){
        	return nombre;
    }
        public void setApellido (String apellido){
        	apellido = apellido;
    }
        public String getApellido(){
       		return apellido;
    }
  	public void ImprimirDatos(){
		System.out.println(getNombre());
		System.out.println(getApellido());
       }
    }

    
   
   
    
   
    

