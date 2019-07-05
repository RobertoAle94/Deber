import java.util.Scanner;
public class AplicativoD{
	public static void main(String []args){
	String cedula;
	float sueldo;

Scanner lee=new Scanner(System.in);
	System.out.println("Ingrese cedula:   ");
		cedula=lee.next();
	System.out.println("Ingrese sueldo:   ");
		sueldo=lee.nextFloat();
	Datos obj1=new Datos(cedula, sueldo);
		obj1.MostrarDatos();
		}
}