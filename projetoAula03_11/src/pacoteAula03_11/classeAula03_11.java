package pacoteAula03_11;

import java.util.Scanner;

public class classeAula03_11 {

	public static void main(String[] args) {
		/*criando uma lista
		 tipo[] nome_variavel = new tipo[tamanho]*/
		int[] numeros = new int[5];
		int i = 0, total = 0;
		Scanner entrada = new Scanner(System.in);
		
		
		for (i = 0; i < 5; i++) {
			System.out.printf("Digite o %d� numero: ", i+1);
			numeros[i] = entrada.nextInt();										// adiciona um numero a posi��o i
			total += numeros[i];												// calcula a soma total 
			
		}
		System.out.printf("A soma dos numeros � %d.", total);
	}

}
