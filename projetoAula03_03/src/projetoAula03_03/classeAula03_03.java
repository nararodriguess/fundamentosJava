package projetoAula03_03;

import java.util.*;

public class classeAula03_03 {

	public static void main(String[] args) {
		// jogo da adivinhação
		char resposta, escolha = 'k';										// tipagem da variavel
		Scanner entrada = new Scanner (System.in);							// Scanner para ler o teclado
		
		System.out.print("Tente adivinhar a letra escolhida de A ate Z: ");
		resposta = entrada.nextLine().charAt(0);							// atribui a "resposta" o que foi digitado no teclado
		
		if (resposta == escolha)											// confere a condição
			System.out.print("Resposta correta!");
		else
			System.out.print("Errado. Tente novamente");
		
		
	}

}
