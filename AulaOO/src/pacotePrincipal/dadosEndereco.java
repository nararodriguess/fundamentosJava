package pacotePrincipal;

public class dadosEndereco {
	
	public String logradouro, complemento, cidade, estado, CEP;
	public int numero;
	
	
	
	public String imprimirDadosEndereco() {
		return "\nRua: " + logradouro + "\nNumero: " + Integer.toString(numero) + "\nComplemnto: " + complemento + "\nCidade: " + cidade + "\nEstado: " + estado + "\nCEP: " + CEP;
		
		
	}

}
