package projetoAula03_04;

import java.util.*;										//import para ler o teclado

public class classeAula03_04 {

	public static void main(String[] args) {
		int num1, num2;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		num1 = entrada.nextInt();
		
		System.out.print("Digite o segundo número: ");
		num2 =  entrada.nextInt();
		
		if (num1 == num2)
			System.out.print("Os números digitados são iguais" );
		else {
			if (num1>num2)
				System.out.print("O primeiro numero é maior que o segundo");
			else
				System.out.print("O primeiro numero é menor que o segundo");
		}
	}

}
