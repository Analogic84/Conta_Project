package conta.view;


/**
 * @author anita
 *
 */
import java.util.Scanner;

public class SimulaPrestamo {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);

		double importe, tipo, limite;
		int periodo;

		System.out.print("Introduce el importe del pr�stamo: ");
		importe = scanner.nextDouble();

		System.out.print("Introduce el tipo de inter�s: ");
		tipo = scanner.nextDouble();

		System.out.print("Introduce el tiempo de amortizaci�n (a�os): ");
		periodo = scanner.nextInt();

		System.out.print("Introduce el l�mite que puedes pagar: ");
		limite = scanner.nextDouble();

		periodo *= 12; // Convertir el tiempo a meses
		tipo = tipo / 1200; // Calcular el tipo mensual

		double numerador = tipo * Math.pow(1 + tipo, periodo);
		double denominador = Math.pow(1 + tipo, periodo) - 1;
		double cuota = importe * (numerador / denominador);

		System.out.println(
				"\nLa cuota mensual ser�a de " + cuota + "\n�La cuota supera tu l�mite? -> " + (cuota > limite));
	}

	public static void addActionListener(VentanaPrincipal ventanaPrincipal) {
		// TODO Auto-generated method stub
		
	}

	

}
