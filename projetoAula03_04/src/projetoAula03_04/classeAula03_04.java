package projetoAula03_04;

import java.util.*;										//import para ler o teclado

public class classeAula03_04 {

	public static void main(String[] args) {
		int num1, num2;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero: ");
		num1 = entrada.nextInt();
		
		System.out.print("Digite o segundo n�mero: ");
		num2 =  entrada.nextInt();
		
		if (num1 == num2)
			System.out.print("Os n�meros digitados s�o iguais" );
		else {
			if (num1>num2)
				System.out.print("O primeiro numero � maior que o segundo");
			else
				System.out.print("O primeiro numero � menor que o segundo");
		}
	}

}
