package projetoAula03_032;

import java.util.*;

public class classeAula03_032 {

	public static void main(String[] args) {
		
		double nota1, nota2, nota3, nota4, media, total, frequencia;
		String status;
		
		Scanner entradaCaracteries = new Scanner(System.in);							// duas entradas Scanner para não dar erro 
		Scanner entradaNota = new Scanner (System.in);
		
		
		System.out.print("Digite o nome do aluno(a): ");
		String nome = entradaCaracteries.nextLine();
		
		System.out.print("Digite a primeira nota do aluno: ");
		nota1 = entradaNota.nextDouble();
		
		System.out.print("Digite a segunda nota do aluno: ");
		nota2 = entradaNota.nextDouble();
		
		System.out.print("digite a terceita nota dpo aluno: ");
		nota3 = entradaNota.nextDouble();

		System.out.print("digite a quarta nota dpo aluno: ");
		nota4 = entradaNota.nextDouble();
		
		System.out.print("Digite a frequencia do aluno: ");
		frequencia = entradaNota.nextDouble();
		
		total = nota1 + nota2 + nota3 + nota4;
		media = total / 3;
		
		if (total >= 70 && frequencia >= 75)
			status = "foi aprovado";
		else if (total >=40 && total < 70 && frequencia >= 75)
			status = "esta de recuperação";
		else
			status = "foi reprovado";
			
		System.out.printf("A nota total do(a) aluno(a) %s é %.2f e a frequencia é de %.2f%%, portanto, o aluno %s.", nome, total, frequencia, status);
	}

}
