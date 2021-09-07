package pacoteTrabalhoPratico02;

import java.util.Scanner;

public class classeTrabalhoPratico02 {

	public static void main(String[] args) {
																						// tipagem de variaveis
		int valor1 = 0, valor2 = 75, valor3 = 0;
																						// leitura do teclado
		Scanner ent = new Scanner (System.in);
		
		System.out.println("Digite um numero inteiro para a variavel valor1: ");
		valor1 = ent.nextInt(); 														// valor1 recebe um valor inteiro
		valor2 += valor1; 																//valor2 é a soma dele mesmo mais valor1
		
		if (valor1 % 2 == 0)															// verifica as condições para calcular valor3
			valor3 =  valor1 * 5;
		else if (valor1 % 3 == 0)
			valor3 = valor2*9;
		else
			valor3 = valor2;
		System.out.printf("O valor da variavel valor3 é %d", valor3);
		

	}

}
