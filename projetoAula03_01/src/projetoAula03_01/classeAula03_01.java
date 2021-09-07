package projetoAula03_01;

public class classeAula03_01 {

	public static void main(String[] args) {
		// Manipulação de strings
		String nome, nome2;
		
		nome = "Nara Teixeira Rodrigues";
		nome2 = "Maria Teixeira Rodrigues";
		
		System.out.println("Nome: " + nome);
		System.out.println("Nome2: " + nome2);
		
		// Conta quantos caracteries a variavel possui
		int tamanhoNome = nome.length(), tamanhoNome2 = nome2.length();
		
		System.out.println("A variavel Nome possui " + tamanhoNome + " caracteries.");
		System.out.println("A variavel Nome2 possui " + tamanhoNome2 + " caracteries.");
		
		// Soma os caracteries das duas variaveis
		int totalCaracteries = tamanhoNome + tamanhoNome2;
		System.out.println("O total de caracteries é " + totalCaracteries);
		
		//Concatena os nomes
		String nomesConcatenados = nome.concat(nome2);
		System.out.println(nomesConcatenados);
		
		
		//Substitui a leta a por 9
		String nomeSemA = nome.replace('a', '9');
		System.out.println(nomeSemA);
		
		// Parte a variavel
		String somenteNome = nome.substring(0, 4);
		System.out.println(somenteNome);
		
		//Deixa a variavel em letras maiusculas
		String nomeMaiusculo = nome.toUpperCase();
		System.out.println(nomeMaiusculo);
		
		
	}

}
