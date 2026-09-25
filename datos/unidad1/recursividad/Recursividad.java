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

	/**
	* Función que realiza cuenta regresiva de acuerdo a un 
	* valor entero
	* Fecha: 25 Septiembre
	* Autor: Gabriel Barrón
	*/
	public static void cuentaRegresiva(int n) {

		if(n < 1) { // Condición Base
			return;
		} else {
			System.out.print(n + " ");
			cuentaRegresiva(n-1);
		}
	}


	public static void main(String[] a) {
		//saludo( "Gabriel", 100);
		cuentaRegresiva(100);
	}

}