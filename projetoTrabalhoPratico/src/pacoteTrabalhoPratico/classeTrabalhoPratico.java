package pacoteTrabalhoPratico;

import java.util.*;


public class classeTrabalhoPratico {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		double n1 =0, n2 = 0, n3 = 2, resultado;
		
		System.out.print("Digite o valo para a variavel n1: ");
		n1 = entrada.nextDouble();
		
		System.out.print("Digite o valor para a variavel n2: ");
		n2 = entrada.nextDouble();
		
		resultado = n1 * n2 / n3;
		System.out.printf("O resultado é %.2f", resultado);
		

	}

}
