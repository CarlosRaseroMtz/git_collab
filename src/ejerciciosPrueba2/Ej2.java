package ejerciciosPrueba2;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double sueldo = 0;
		double antiguedad = 0;
		Scanner sc = new Scanner(System.in);
		int op = 0;
		double res1 = 0;
		double res2 = 0;
		double res3 = 0;

		System.out.println("-----------------------------------------------");
		System.out.println("Bienvenido al programa del ejercicio 2");
		System.out.println("-----------------------------------------------");
		System.out.println();
		System.out.println("Porfavor indique el sueldo");
		sueldo = sc.nextDouble();
		System.out.println("Porfavor indique la antiguedad");
		antiguedad = sc.nextDouble();

		do {
			System.out.println("Indique que opción desea elegir");
			System.out.println("Pulse 1");
			System.out.println("Pulse 2");
			System.out.println("Pulse 3");
			System.out.println("Pulse 0 para salir");
			System.out.println();
			op = sc.nextInt();

			switch (op) {
			case 1:
				if (sueldo < 1000 && antiguedad >= 10) {
					res1 = sueldo * 0.2;
					System.out.println("El resultado del primer case es " + res1);
				}
				break;
			case 2:
				if (sueldo < 1000 && antiguedad < 10) {
					res2 = sueldo * 0.05;
					System.out.println("El resultado del segundo case es " + res2);
				}

				break;
			case 3:
				if (sueldo >= 1000) {
					res3 = sueldo;
					System.out.println("El resultado del tercer case es " + res3);
				}
				break;

			default:
				System.out.println("Te has equivocado poniendo el número o se ha terminado");
				break;
			}

		} while (op != 0);

		System.out.println("Se ha terminado el programa");

	}

}
