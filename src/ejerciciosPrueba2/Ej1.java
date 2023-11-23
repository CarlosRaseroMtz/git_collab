package ejerciciosPrueba2;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		String numEntero;
		int resultadoDosPrimeras = 0;
		int resultadoDosUltimas = 0;
		int op = 0;

		System.out.println("-----------------------------------------------");
		System.out.println("Bienvenido al programa del ejercicio 1");
		System.out.println("-----------------------------------------------");

		//Esto es un bucle con do
		do {

			System.out.println("Escriba un número de 4 cifras");
			System.out.println("");
			numEntero = sc.next();

			// Aqui muestro las posiciones del número de 4 cifras
			for (int i = 0; i < numEntero.length(); i++) {
				char a = numEntero.charAt(i);
				System.out.println(a);
				resultadoDosPrimeras = numEntero.charAt(0) * numEntero.charAt(1);
				resultadoDosUltimas = numEntero.charAt(2) * numEntero.charAt(3);
			}
			if (resultadoDosPrimeras > resultadoDosUltimas) {
				System.out.println("El producto de las 2 primeras cifras es mayor ya que el" + "resultado es "
						+ resultadoDosPrimeras);

			} else {
				System.out.println("El producto de las 2 últimas cifras es mayor ya que el" + "resultado es "
						+ resultadoDosUltimas);

			}
			System.out.println();
			System.out.println("¿Desea volver a repetir el programa?");
			System.out.println();
			System.out.println("Pulse 1 para volver a repetir el programa o se cerrará");

			op = sc.nextInt();
			
			//esto es un bucle
		} while (op == 1);
		System.out.println("-------------------------------------------------------");
		System.out.println("Se ha terminado el programa, muchas gracias por usarme");
		System.out.println("-------------------------------------------------------");

	}

}
