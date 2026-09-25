package datos.unidad1.recursividad;

public class Recursividad {

	public static void saludo(String nombre, int total) {
		
		if(total <= 0) //condicion Base
			return;
	
		else {  // condicion recursiva o repetitiva
			System.out.println("Hola " + nombre);
			saludo(nombre, total-1);	
		}	
	}


	public static void main(String[] a) {
		saludo( "Gabriel", 100);
	}

}