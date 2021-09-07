package pacotePrincipal;

public class pessoa {
	
	public int idade;
	public String nome, CPF;
	dadosEndereco endereco;
	
	pessoa (){
		endereco = new dadosEndereco();
	}
	
	pessoa (String name, int age, String id, String street, int number, String complem, String city, String UF, String cod){
		nome = name;
		idade = age;
		CPF = id;
		endereco = new dadosEndereco();
		endereco.logradouro = street;
		endereco.numero = number;
		endereco.complemento = complem;
		endereco.cidade = city;
		endereco.estado = UF;
		endereco.CEP = cod;
	}
	
	public String imprimirDadosPessoa(char imprimirDadosEndereco) {
		if (imprimirDadosEndereco == 'n' || imprimirDadosEndereco =='N')
			return "Nome: " + nome + "\nCPF: " + CPF + "\nIdade: " + Integer.toString(idade);
		else
			return "Nome: " + nome + "\nCPF: " + CPF + "\nIdade: " + Integer.toString(idade) + endereco.imprimirDadosEndereco();
		
	}
		
}
