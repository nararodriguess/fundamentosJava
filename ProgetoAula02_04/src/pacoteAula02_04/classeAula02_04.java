package pacoteAula02_04;

public class classeAula02_04 {

	public static void main(String[] args) {
		int nota = 20;																	// declarando o tipo das variaveis
		char tipoAluno = 'b';
		double horasCursadas = 2.5;
		boolean aprovado = true;
																										
		System.out.println("Nota: " + nota);											// mostra na tela os dados			
		System.out.println("Tipo de aluno: " + tipoAluno);
		System.out.println("Horas cursadas: " + horasCursadas);
		System.out.println("Situação do aluno: " + aprovado);
		
		nota = 30;
		tipoAluno = 'g';
		horasCursadas = 5.5;
		aprovado = false;
		
		System.out.println("Nota: " + nota);
		System.out.println("Tipo de aluno: " + tipoAluno);
		System.out.println("Horas cursadas: " + horasCursadas);
		System.out.println("Situação do aluno: " + aprovado);
		
	}

}
