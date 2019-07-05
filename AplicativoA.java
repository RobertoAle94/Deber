import java.util.Scanner;
public class AplicativoA{
	public static void main(String []args){
	String nombre, apellido;

Scanner lee=new Scanner(System.in);
	System.out.println("Ingrese nombre:   ");
		nombre=lee.next();
	System.out.println("Ingrese apellido:   ");
		apellido=lee.next();
	Alumno obj1=new Alumno(nombre, apellido);
		obj1.ImprimirDatos();
		}
}