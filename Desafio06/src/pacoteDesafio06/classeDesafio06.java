package pacoteDesafio06;

import java.io.*;
import java.util.Scanner;

public class classeDesafio06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] numeros = new int[50];
		int contaNumeros = 0;
		char continuar = 's';
		
		while (continuar == 's') {
			System.out.printf("Digite o %d numero: \n", contaNumeros);
			numeros[contaNumeros] = entrada.nextInt();
			contaNumeros++;
			
			entrada.nextLine();
			System.out.println("Deseja continuar digitando numeros: ");
			continuar = entrada.nextLine().charAt(0);
		}
		try {
			FileWriter arq = new FileWriter("C:\\Users\\Nara\\saidaDesafio.txt");
			PrintWriter gravaArquivo = new PrintWriter(arq);
			for (int i = 0; i< contaNumeros; i++) {
				if (numeros[i] % 2 == 0 && numeros[i] > 10)
					gravaArquivo.printf("%d\n", numeros[i]);
			}
			arq.close();
			gravaArquivo.close();
			System.out.println("Programa fializado.");
		}
		catch (IOException e ) {
			System.err.println("Erro gravando dados: " + e.getMessage());
		}
	}

}
