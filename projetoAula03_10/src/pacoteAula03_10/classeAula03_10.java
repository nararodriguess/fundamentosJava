package pacoteAula03_10;

import java.util.Scanner;

public class classeAula03_10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		char continua = ' ';
		
		System.out.print("Deseja continuar (s = sim, n = nao): ");
		continua = entrada.nextLine().charAt(0);
		
		/*while (continua == 's') {
			System.out.print("Essa mensagem esta em um while.");
			System.out.print("Deseja continuar? ");
			continua = entrada.nextLine().charAt(0);
			
		}*/
		
		// utilizando o 'do while' para looping
		do {
			System.out.print("Mensagem dentro do 'do'.");
			System.out.print("Deseja continuar? ");
			continua = entrada.nextLine().charAt(0);
			
		} while (continua == 's');
		
			
		
		

	}

}
