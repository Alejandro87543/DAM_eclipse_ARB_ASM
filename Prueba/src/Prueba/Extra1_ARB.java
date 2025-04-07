package Prueba;
import java.util.*;
public class Extra1_ARB {
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		
		final double DESCUENTO_MENOR_50 = 0.08;
		final double DESCUENTO_MAYOR_50 = 0.1;

		System.out.print("Introduce el nombre del primer producto: ");
		String producto1 = teclado.nextLine().toUpperCase();
		System.out.print("Introduce el precio del primer producto: ");
		double precio1 = teclado.nextDouble();
		teclado.nextLine();

		System.out.print("Introduce el nombre del segundo producto: ");
		String producto2 = teclado.nextLine().toUpperCase();
		System.out.print("Introduce el precio del segundo producto: ");
		double precio2 = teclado.nextDouble();
		teclado.nextLine();

		System.out.print("Introduce el nombre del tercer producto: ");
		String producto3 = teclado.nextLine().toUpperCase();
		System.out.print("Introduce el precio del tercer producto: ");
		double precio3 = teclado.nextDouble();

		double descuento1 = (precio1 < 50) ? precio1 * DESCUENTO_MENOR_50 : precio1 * DESCUENTO_MAYOR_50;
		double descuento2 = (precio2 < 50) ? precio2 * DESCUENTO_MENOR_50 : precio2 * DESCUENTO_MAYOR_50;
		double descuento3 = (precio3 < 50) ? precio3 * DESCUENTO_MENOR_50 : precio3 * DESCUENTO_MAYOR_50;

		double totalSinDescuento = precio1 + precio2 + precio3;
		double totalConDescuento = totalSinDescuento - (descuento1 + descuento2 + descuento3);

		System.out.println("\n--- FACTURA ---");
		System.out.println(producto1 +": Precio: "+precio1 +" - Descuento: " + descuento1 + " euros");
		System.out.println(producto2 + " - Descuento: " + descuento2 + " euros");
		System.out.println(producto3 + " - Descuento: " + descuento3 + " euros");
		System.out.println("Total descontado: "+(descuento1 +descuento2 +descuento3) +" euros");
		System.out.println("Total sin descuento: " + totalSinDescuento + " euros");
		System.out.println("Total con descuento: " + totalConDescuento + " euros");
	}
}