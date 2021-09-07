package pacoteAula03_07;

import java.util.Scanner;

public class classeAula03_07 {

	public static void main(String[] args) {
		
		double n1 = 0, n2 = 0, total = 0;
		char operacao = ' ';
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite o primeiro numero: ");
		n1 = entrada.nextDouble();
		
		System.out.println("Digite o segundo numero: ");
		n2 = entrada.nextDouble();
		
		
		entrada.nextLine();
		System.out.println("Digite a operação desejada ( +, -, *, /, %): ");
		operacao = entrada.nextLine().charAt(0);
		
		// UTILIZANDO O SWITCH PARA DETERMINAR OPERAÇÕES
		switch (operacao) {
			case '+':
				total = n1+n2;
				break;
			case '-':
				total = n1 - n2;
				break;
			case '/' :
				total = n1 / n2;
				break;
			case '*':
				total = n1 * n2;
				break;
			case '%':
				total = n1 % n2;
				break;
			default:
				System.out.println("Operação desconhecida");
							
		}
		if (operacao == '+' || operacao == '-' || operacao == '*' || operacao == '/' || operacao=='%')
			System.out.printf("O resultado de %.2f %c %.2f = %.2f", n1, operacao, n2, total);
		

	}

}
