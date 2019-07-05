
public class Datos{

	private String cedula; 
	private float sueldo;
	public Datos (String cedula, float sueldo){
		this.cedula=cedula;
		this.sueldo=sueldo;
}
	public void setCedula(String cedula){
       		cedula=cedula;   
}
	public String getCedula(){
       		return cedula;   
}
	public void setSueldo(float sueldo){
       		sueldo=sueldo;   
}
	public float getSueldo(){
       		return sueldo;   
}
	public void MostrarDatos(){
		System.out.println(getCedula());
		System.out.println(getSueldo());
}
}