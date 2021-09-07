package pacoteAulaPratica01;

import java.util.Scanner;

public class classeAulaPratica01 {

	public static void main(String[] args) {
		// declarando o tipo das variaveis
		double n1 = 0, n2 = 0, total = 0;
		Scanner entrada = new Scanner (System.in);
		char operacao;
		
		// atribuindo valores a n1 e n2
		
		System.out.println("Digite o primeiro numero: ");
		n1 = entrada.nextDouble();
		
		System.out.println("Digite o segundo numero: ");
		n2 = entrada.nextDouble();
		
		
		entrada.nextLine();															//não gerar erro ao ler teclado com variaveis de tipos diferentes
		System.out.println("Digite a operação desejada ( +, -, *, /): ");
		operacao = entrada.nextLine().charAt(0);
		
		if (operacao == '+')
			total = n1 + n2;
		else if (operacao == '-')
			total = n1 - n2;
		else if (operacao == '*')
			total = n1 * n2;
		else
			total = n1 / n2;
		
		System.out.printf("O resultado de %.2f %c %.2f = %.2f", n1,operacao, n2, total);
				
		

	}

}
