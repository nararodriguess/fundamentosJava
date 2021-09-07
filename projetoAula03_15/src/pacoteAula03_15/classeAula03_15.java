package pacoteAula03_15;

import java.util.Scanner;

public class classeAula03_15 {

	public static void main(String[] args) {
		

		char operacao = ' ';
		Scanner entChar = new Scanner(System.in);
		Scanner entNum = new Scanner (System.in);
		int[] numeros = new int[1000];
		int i = 0, somatorio = 0, somapar = 0;
		
		
		do {
			System.out.print("Menu de opções: \n" +
					"S: apresenta o somatorio dos números. \n" +
					"D: digitar novos números \n" +
					"V: visualizar os numeros digitador\n" +
					"P: quantidade de pares.\n" +
					"Q: quantidade de números digitados. \n" +
					"M: media simples dos números digitados.\n"
					+ "E: sair do programa.\n");
			
			operacao = entChar.nextLine().charAt(0);
			
			switch (operacao) {
				case 'd':
					System.out.print("Digite o numero desejado: ");
					numeros[ i] = entNum.nextInt();
					i++;
					break;
					
				case 's':
					for (int j = 0; j < i; j++) {
						somatorio += numeros[j];
					}
					System.out.printf("O somatório dos numeros é: %d\n", somatorio);
					break;
				
				case 'v':
					for (int j = 0; j < i; j++) {
						System.out.printf("%d\n", numeros[j]);
					}
					break;
				
				case 'p':
					for (int j = 0; j<i; j++) {
						if (numeros[j] % 2 == 0)
							somapar++;
					}
					System.out.printf("Quantidade de numeros pares: %d.\n", somapar);
					break;
	
				case 'q':
					System.out.printf("Você digitou %d numeros.\n", i);
					break;
				
				case 'm':
					for (int j = 0; j <i; j++) {
						somatorio += numeros[j];
					}
					float media = somatorio / i;
					System.out.printf("A média dos números digitados é %.2f.\n", media);
					break;
				case 'e':
					break;
				default:
					System.out.print("Opção inválida.");
			}
			
		} while ( operacao != 'e');
			
		System.out.print("Fim do programa");
	}			
		
}
	

