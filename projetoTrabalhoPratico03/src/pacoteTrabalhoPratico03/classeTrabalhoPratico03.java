package pacoteTrabalhoPratico03;
import java.util.Scanner;

public class classeTrabalhoPratico03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);												// ler dados do teclado
		double nota1 = 0, nota2 = 0, nota3 = 0, notaTotal = 0, frequencia = 0;            		// tipagem de variaveis
		double notaCorte = 50, freqCorte = 60;
		
																								// recebe do teclado os dados
		System.out.print("Digite a primeira nota: ");
		nota1 = entrada.nextDouble();
		System.out.print("Digite a segunda nota: ");
		nota2 = entrada.nextDouble();
		System.out.print("Digite a terceira nota: ");
		nota3 = entrada.nextDouble();
		System.out.print("Digite a frequencia do aluno: ");
		frequencia = entrada.nextDouble();
		
		notaTotal = nota1 + nota2 + nota3;														// verifica as condições
		if (notaTotal >= notaCorte && frequencia >= freqCorte)
			System.out.println("Aprovado");
		else if (notaTotal >= (notaCorte - notaCorte * 0.20) && frequencia >= freqCorte)
			System.out.println("Prova especial");
		else if (notaTotal >= 80)
			System.out.println("Aprovado direto");
		else
			System.out.println("Reprovado");
	}

}
