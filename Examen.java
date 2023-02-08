package Package1;

public class Examen {
	

// Función para primera mayúscula usando toUpperCase para convertir un string en mayusculas 
// 
// Usamos substrin para indicar que solo es una letra
	public String primeraMayuscula(String input) {
		String userLine = input.replace(input.substring(0,1), input.substring(0,1).toUpperCase());
		return userLine;
	}
	
	
// Función que invierte cadena 	
	public String invertirCadena(String input) {
		String userLine = "";
		
		for(int i = input.length(); i > 0; i = i-1) {
			userLine = userLine + input.substring(i-1,i);
		}
		return userLine;
	}
	
	
// 	CONCATENA VOCALES PARA NO HACER UN READ QUE OS MANDE A LLAMAR
	
/*for(int x=0;x<sPalabra.length();x++) {
 if ((sPalabra.charAt(x)=='a') || (sPalabra.charAt(x)=='e') || (sPalabra.charAt(x)=='i') || (sPalabra.charAt(x)=='o') || (sPalabra.charAt(x)=='u')){ 
    contador++;
  }
}
 * 	
 */
	public String vocalesMayuscula(String input) {
		String userLine = "";
		
		for(int i = 0; i < input.length(); i = i+1) {
			// AND LÓGICO
			if(input.substring(i,i+1).contains("a") || input.substring(i,i+1).contains("e") || input.substring(i,i+1).contains("i") || input.substring(i,i+1).contains("o") || input.substring(i,i+1).contains("u")) {
				userLine = userLine + input.substring(i,i+1).toUpperCase();
			} else {
				userLine = userLine +input.substring(i,i+1);
			}
		}
		return userLine;
	}
	
	public void fizzBuzz() {
		for(int i = 1; i <=100; i=i+1) {
			if((i%3==0) && (i%5==0)) {
				System.out.println("FizzBuzz");
			} else if(i%3==0) {
				System.out.println("Fizz");
			} else if(i%5==0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}
	
	public boolean palindromo(String input) {
		String userLine = "";
		String original = "";
		int length = input.length();
		
		for(int i = 0; i<length; i=i+1) {
			if(input.substring(i,i+1).contains(" ")) {
				continue;
			} else {
				original = original + input.substring(i,i+1).toLowerCase();
		
			
			}
		
		
		}
		
		for(int i = original.length(); i > 0; i = i-1) {
			userLine = userLine + original.substring(i-1,i).toLowerCase();
		}
		
		if(original.equals(userLine)) {
			return true;
		} else {
			return false;
		}
		
	}
}