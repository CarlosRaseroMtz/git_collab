package ejerciciosPrueba2;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int totalNotas = 0;
		int notas = 0;
		int contadorSus = 0;
		int contadorApro = 0;
		int contadorExc = 0;
		int contadorNotas = 0;
		int media = 0;
		int notaMasAlta = 0;
		int notaMasBaja = 10;

		while (notas <= 10 && notas >= 0) {

			System.out.println("Escriba una nota");
			notas = sc.nextInt();

			totalNotas += notas;
			contadorNotas++;

			if (notas < 5) {
				contadorSus++;
			} else if (notas <= 5 && notas < 7) {
				contadorApro++;
			} else {
				contadorExc++;
			}

			if (notaMasAlta <= notas && notas <= 10) {
				notaMasAlta = notas;
			}

			if (notaMasBaja >= notas && notas >= 0) {
				notaMasBaja = notas;
			}

		}
		System.out.println("Se finalizó el programa debido a que " + "la nota no es válida");

		media = totalNotas / contadorNotas;

		System.out.println("La nota más alta es un " + notaMasAlta);
		System.out.println("La nota más baja es un " + notaMasBaja);
		System.out.println("La media es " + media);
		System.out.println("Hay un total de " + contadorApro + " aprobados");
		System.out.println("Hay un total de " + contadorExc + " excelentes");
		System.out.println("Hay un total de " + contadorSus + " suspensos");

	}

}
