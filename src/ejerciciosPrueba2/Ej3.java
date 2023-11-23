package ejerciciosPrueba2;

public class Ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isFord = true;
		boolean isRenault = true;
		boolean isForFiesta = true;
		boolean isForFocus = true;
		boolean isOtherCar = true;
		double precio = 3000;
		double total1 = 0;
		double total2 = 0;
		double total3 = 0;
		double total4 = 0;

		System.out.println("El precio para un Renault seria...");
		if (isRenault) {
			total1 = precio - (precio * 0.15);
			System.out.println("El precio sería " + total1 + " euros");
		}

		System.out.println("El precio para un Ford modelo Fiesta seria...");
		if (isFord && isForFiesta) {
			total2 = precio - (precio * 0.07);
			System.out.println("El precio sería " + total2 + " euros");
		}
		System.out.println("El precio para un Ford modelo Focus seria...");
		if (isFord && isForFocus) {
			total3 = precio - (precio * 0.10);
			System.out.println("El precio sería " + total3 + " euros");

			System.out.println("El precio para el resto seria...");
		}
		total4 = precio - (precio * 0.05);
		System.out.println("El precio sería " + total4 + " euros");

	}

}
