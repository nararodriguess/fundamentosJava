package pacoteAula03_09;

import java.util.Scanner;

public class classeAula03_09 {

	public static void main(String[] args) {
		char continua = 's';													// tipagem das vari�veis e chamada para ler teclado
		int num = 0, soma = 0, cont = 0;
		Scanner entrada = new Scanner (System.in);
		
		while (continua == 's') {												// enquanto 'continua' for igual a sim, sera executado
			System.out.print("Digite um n�mero: ");
			num = entrada.nextInt();
			soma += num;
			cont +=1;
			
			entrada.nextLine();
			System.out.print("Deseja continuar o programa ( s = sim; n = n�o)? "); // verifica se o looping continua
			continua = entrada.nextLine().charAt(0);
			
		}
		System.out.printf("Voc� digitou %d numeros e a soma dos n�meros digitados �: %d", cont,soma); // mostra o resultado
	}

}
