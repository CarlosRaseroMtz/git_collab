package ejerciciosPrueba2;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int numEscrito = 0;
		int numDivisible = 0;

		System.out.println("Escribe un número");
		numEscrito = sc.nextInt();

		System.out.println("Escribe el número que no quieres que sea divisible");
		numDivisible = sc.nextInt();

		while (numEscrito > 0) {
			numEscrito--;

			if (numEscrito % numDivisible == 0) {
				System.out.println(numEscrito);
			}

		}

	}

}
