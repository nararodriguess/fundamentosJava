package pacotePrincipal;

import java.util.Scanner;

public class classePrincipal {

	public static void main(String[] args) {
		
		String[] nomes = new String[50];											//cria vetor para armazenar nomes
		int[] idades = new int[50];													// cria vetor para armazenar idade
		char[] situacoes = new char[50];											// armazena no vetor a situação
		
		Scanner entCaractere = new Scanner(System.in);
		Scanner entNum = new Scanner (System.in);
		
		char continuar = 's';														// definir char para continuar o programam
		int nPessoas = 0, idade = 0, maiorIdade = 0;								// determina tipo das variaveis
				
		while (continuar == 's' || continuar =='S') {								// verifica se o usuario quer continuar
			System.out.printf("Digite o nome da %dº pessoa: \n", nPessoas + 1);		// recebe o nome da pessoa na posição nPessoa + 1
			nomes[nPessoas] = entCaractere.nextLine();								// incrementa nome em nPessoas
																					
			while(nomes[nPessoas].equals("")) {																// verifica se o nome digitado é igual a " "
				System.out.printf("Nome invalido. Digite o nome da %dº pessoa: ", nPessoas + 1); 			//verifica se o vetor é null
				nomes[nPessoas] = entCaractere.nextLine();
			}
			System.out.printf("Digite a idade da %dº pessoa: \n", nPessoas + 1);
			idades[nPessoas] = entNum.nextInt();															// incrementa ao vetor idades a idade da pessoa
			
			while(idades[nPessoas]< 0 ) {																	//verifica se idade é < que 0
				System.out.printf("Digite a idade válida da %dº pessoa: \n", nPessoas + 1);
				idades[nPessoas] = entNum.nextInt();														// incrementa ao vetor idades a idade da pessoa
			}
			
			if (idades[nPessoas]> maiorIdade)																//verifica qual a maior idade
				maiorIdade = idades[nPessoas];																// atribui valores a maiorIdade
			
			
			System.out.printf("Digite a situação da %d pessoa ( A: ativo; E: excluido; I: inativo): ", nPessoas +1);	// recebe a situação da pessoa
			situacoes[nPessoas] = entCaractere.nextLine().charAt(0);
			
			while(situacoes[nPessoas] != 'a' && situacoes[nPessoas] != 'e' && situacoes[nPessoas] != 'i' &&				//confere se a char invalido
				situacoes[nPessoas] != 'A' && situacoes[nPessoas] != 'E' && situacoes[nPessoas] != 'I') {
				System.out.print("A situação digitada é inválida.\n");
				System.out.printf("Digite a situação da %d pessoa ( A: ativo; E: excluido; I: inativo): ", nPessoas +1);
				situacoes[nPessoas] = entCaractere.nextLine().charAt(0);
			}
			System.out.println("Deseja continuar? ( S: sim; N: não) ");													//confere se quer continuar
			continuar = entCaractere.nextLine().charAt(0);
			
			nPessoas++;																									// acrescenta 1 em numero de pessoas
		} //fim while
		
		System.out.println("*****Dados das pessoas*****");
		for(int i = 0 ; i < nPessoas; i++)
			System.out.printf("Nomes: %s, Idade: %d, Situacao: %c.\n", nomes[i], idades[i], situacoes[i]);
		
		System.out.printf("A maior idade é de %d", maiorIdade);
		
		

	}

}
