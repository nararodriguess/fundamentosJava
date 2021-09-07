package pacotePrincipal;

import java.util.*;


public class classePrincipal {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		Scanner entStr = new Scanner(System.in);
		pessoa p1 = new pessoa();
		char imprimirEndereco = ' ';
		
		System.out.print("Digite o nome: ");
		p1.nome = entStr.nextLine();
		
		System.out.print("Digite a idade: ");
		p1.idade = ent.nextInt();
		
		System.out.print("Digite o CPF:");
		p1.CPF = entStr.nextLine();
		
		System.out.print("Digite a rua: ");
		p1.endereco.logradouro = entStr.nextLine();
		
		System.out.print("Digite o numero: ");
		p1.endereco.numero = ent.nextInt();
		
		System.out.print("Digite o complemento: ");
		p1.endereco.complemento = entStr.nextLine();
		
		System.out.print("Digite a cidade: ");
		p1.endereco.cidade = entStr.nextLine();
		
		System.out.print("Digite o estado: ");
		p1.endereco.estado = entStr.nextLine();
		
		System.out.print("Digite o CEP: ");
		p1.endereco.CEP = entStr.nextLine();
			
		System.out.print("Deseja imprimir os dados do endereço: ");
		imprimirEndereco = entStr.nextLine().charAt(0);
		
		
		System.out.printf("%s\n", p1.imprimirDadosPessoa(imprimirEndereco));
		
		
		pessoa p2 = new pessoa("Nara", 21, "000.000,000-00", "Rua Sao Simao", 256, "CS", "Jap", "MG", "00000000");
		
		System.out.printf("%s\n", p2.imprimirDadosPessoa(imprimirEndereco));
		
		
		

	}

}
