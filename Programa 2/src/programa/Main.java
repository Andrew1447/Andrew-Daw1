package programa;

import java.util.Scanner;

public class Main {

	Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);

		System.out.println("pon el importe de la compra");
		int numero = entrada2.nextInt();
		double importe = numero;

		System.out.println("Elije que tipo de cliente eres");
		System.out.println("1.normal 2.socio 3.vip");
		String tipo = entrada.next();

		switch (tipo) {
		case "1":
			System.out.println("has elegido ser un cliente normal");
			System.out.println("Al ser un cliente normal no dispondras de ningun descuento, el precio final será: " + numero);
			break;
		case "2":
			System.out.println("has elegido ser un cliente socio");
			double cinco = importe * 0.05;
			double resultado = importe - cinco;
			System.out.println("al ser un cliente socio dispondras de un descuento del 5% el total de su compra sera "+ resultado);
			break;
		case "3":
			System.out.println("has elegido ser un cliente vip");
			double veinte = importe * 0.20;
			double resultado2 = importe - veinte;
			System.out.println("por ser un cliente vip se te aplicara un descuento del 20% " + resultado2);
			break;
		default:
			System.out.println("opcion no valida");
		}

		entrada.close();
		entrada2.close();

	}
}
