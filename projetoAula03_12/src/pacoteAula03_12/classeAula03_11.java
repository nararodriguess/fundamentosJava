package pacoteAula03_12;

import java.util.*;

public class classeAula03_11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num = 0, somatorio = 0, contador = 0;
		
		do {
			System.out.print("Digite um número positivo para somar ou 0 para sair: ");
			num = entrada.nextInt();
			
			if (num == 18)
				break; //para o programa
			
				// o comando 'continue' (salta a linha de baixo/ pula para a proxima interação)
			
			somatorio += num;
			contador += 1;
			
		} while(num > 0);
		System.out.printf("O somatorio dos numero é %d.", somatorio);
		
		
				
		
		/* PROGRAMA COM WHILE
		 * System.out.print("Digite o numero desejado: ");
		num = entrada.nextInt();
		
		while (num > 0) {
			somatorio += num;			
			
			System.out.print("Digite o numero desejado: ");
			num = entrada.nextInt();
			
		
		System.out.printf("O somatorio foi %d.", somatorio);
		}*/

	}

}
