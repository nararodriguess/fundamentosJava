package projetoAula03_02;

import java.math.*;
import java.util.*;

public class classeAula03_02 {

	public static void main(String[] args) {
		// tipagem das variaveis
		double nota1, nota2, nota3, nota4, totalNota, frequencia;
		char sexoAluno;
		
		// Codigo do objeto para ler o que foi digitado no teclado separado por tipo (int, str...)
		Scanner entradaNotas = new Scanner (System.in);
		Scanner entradaCaracteries = new Scanner(System.in);
		
		// lê o nome digitado no teclado
		System.out.print("Digite o nome do aluno: ");
		String nomeAluno = entradaCaracteries.nextLine();
		
		// lê o sexo do aluno
		System.out.print("Digite o sexo do aluno (F/M): ");
		sexoAluno = entradaCaracteries.nextLine().charAt(0);		
		
		// lê a situação do aluno
		System.out.print("Digite o status do aluno(Matriculado/Não Matriculado):");
		String statusAluno = entradaCaracteries.nextLine();
		
		// lê as notas do aluno
		System.out.print("Digite a primeira nota do aluno: ");
		nota1 = entradaNotas.nextDouble();
		
		System.out.print("Digite a segunda nota do aluno: ");
		nota2 = entradaNotas.nextDouble();
		
		System.out.print("Digite a terceira nota do aluno: ");
		nota3 = entradaNotas.nextDouble();
		
		System.out.print("Digite a quarta nota do aluno: ");
		nota4 = entradaNotas.nextDouble();
		
		
		// lê a frequencia do aluno
		System.out.print("Digite a frequencia do aluno: ");
		frequencia = entradaNotas.nextDouble();
		
		// calcula a soma das notas
		totalNota= nota1 + nota2 + nota3 + nota4;
		
		
		//Confere se aluno passou de ano
		boolean aprovado = totalNota >=70 && frequencia >=0.75;
		
		
		System.out.printf("Aluno(a) %s possui o status como %s e obteve %.2f%% de frequencia e %.2f de nota final."
				+ "\n", nomeAluno, statusAluno, frequencia * 100, totalNota);
		System.out.printf("Aluno aprovado? %b.", aprovado);
		
		
	}

}
