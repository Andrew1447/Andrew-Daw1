package Programa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Escribe el nombre del alumno");
		String nombre = scanner.nextLine();
		System.out.println("introduce las notas de " + nombre);

		System.out.println("Introduce la nota de Gimnasia");
		double gimnasia = entrada.nextDouble();

		System.out.println("Introduce la nota de Matematicas");
		double matematicas = entrada.nextDouble();

		System.out.println("Introduce la nota de Lengua");
		double lengua = entrada.nextDouble();

		System.out.println("Introduce la nota de Historia");
		double historia = entrada.nextDouble();
		
		System.out.println("Introduce la nota de Informatica");
		double informatica = entrada.nextDouble();
		
		double Media = (matematicas + informatica + historia + lengua + gimnasia) /5;
		
		System.out.println("La media es " + Media);
		
		if (Media >= 5 && gimnasia >= 5 && matematicas >= 5 && lengua >= 5 && historia >= 5 && informatica >= 5 ){
			System.out.println("la media de "+ nombre + " es superior a 5 " + Media);
		}
		
		else{
			System.out.println(nombre + " no ha llegado a la media o ha suspendido alguna asignatura " + Media);
		}
		
		entrada.close();
		scanner.close();

		
	}
	
	
}
