package Prueba;
import java.util.*;
public class Extra2_ASM {
	public static Scanner teclado=new Scanner (System.in);
	public static void main(String[] args) {
		int TARIFA_NORMAL = 16;
		int TARIFA_EXTRA = 20;
		int HORAS_NORMALES = 40;
		System.out.print("Introduce el número de horas trabajadas en la semana: ");
		int horasTrabajadas = teclado.nextInt();

		int salarioNormal = 0;
		int salarioExtra = 0;
		int salarioTotal = 0;

		if (horasTrabajadas <= HORAS_NORMALES) {
			salarioNormal = horasTrabajadas * TARIFA_NORMAL;
		} else {
			salarioNormal = HORAS_NORMALES * TARIFA_NORMAL;
			salarioExtra = (horasTrabajadas - HORAS_NORMALES) * TARIFA_EXTRA;
		}
		salarioTotal = salarioNormal + salarioExtra;
		System.out.println("\n--- CÁLCULO DE SALARIO ---");
		System.out.println("Salario por horas normales: " + salarioNormal + " euros");
		System.out.println("Salario por horas extras: " + salarioExtra + " euros");
		System.out.println("Salario total: " + salarioTotal + " euros");
	}
}
