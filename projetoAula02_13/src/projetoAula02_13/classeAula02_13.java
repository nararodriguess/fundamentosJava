package projetoAula02_13;

public class classeAula02_13 {

	public static void main(String[] args) {
		// Situação Aluno
		
		String nomeAluno = "Nara Teixeira Rodrigues";
		double nota1, nota2, nota3, nota4, frequencia, totalNota;
		boolean aprovado, matriculado;
		
		matriculado = true;
		
		nota1 = 10;
		nota2 = 20;
		nota3 = 30;
		nota4 = 40;
		
		frequencia = 0.2;
		totalNota = nota1 + nota2 + nota3 + nota4;
		
		aprovado = totalNota >= 70 && frequencia >= 0.75;
		
		System.out.printf("Nome do aluno: %s; \nAluno matriculado: %b; \nNota do aluno: %.2f; \nFrequencia do aluno: %.2f; \nAluno aprovado: %b", nomeAluno, matriculado, totalNota, frequencia, aprovado);
		
		
		

	}

}
