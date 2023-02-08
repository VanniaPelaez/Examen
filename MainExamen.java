package Package1;

import java.util.Scanner;

public class MainExamen {

	public static void main(String[] args) {
		
		System.out.println("Oprime el numero que deseas");
		
		// CICLO WHILE = ALARMA 
		while(true) {
			
			System.out.println("Eliga una opcion:");
			System.out.println("Primera mayúscula --> 1");
			System.out.println("Invertir una cadena -->2");
			System.out.println("Vocales en mayúscula --> 3");
			System.out.println("FizzBuzz -->4");
			System.out.println("Palindromo -->5 ");
			System.out.println("Terminar ciclo -->6");
			
			Scanner scan = new Scanner(System.in);
			String option = scan.nextLine();
			
			Examen miExamen = new Examen();
			String inputUs;
			
			switch(option) {
				case "1":
					System.out.println("Inserte palabra");
					inputUs = scan.nextLine();
					System.out.println(miExamen.primeraMayuscula(inputUs) + "\n");
					continue;
					
				case "2":
					System.out.println("Inserte palabra u oración");
					inputUs = scan.nextLine();
					System.out.println(miExamen.invertirCadena(inputUs) + "\n");
					continue;
				
				case "3":
					System.out.println("Inserte palabra u oración");
					inputUs = scan.nextLine();
					System.out.println(miExamen.vocalesMayuscula(inputUs) + "\n");
					continue;
				
				case "4":
					miExamen.fizzBuzz();
					System.out.println();
					continue;
					
				case "5":
					System.out.println("Inserte palabra u orqación (no se toman en cuenta espacios)");
					inputUs = scan.nextLine();
					System.out.println(miExamen.palindromo(inputUs) + "\n");
					continue;
					
				// INTERRUMPE CICLOOO	
				case "6":
					System.out.println("Se cierra iteración");
			 		System.exit(0);
			 		break;
					
			 	// AFUERA DEL CICLO 
				default:
					System.out.println("Su linea no se encuentra dentro del menú. Try again");
					continue;
			}
			
			scan.close();
		}
	}
}