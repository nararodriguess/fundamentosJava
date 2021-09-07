package projetoAula02_11;

public class classeAula02_11 {

	public static void main(String[] args) {
		//Concessão de emprestimos
		boolean ult3EmprestimoQuitadoPrazo, possuiRendaComprovada, clienteCincoEstrelas, restricaoCredito;   // definindo o tipo
		
		ult3EmprestimoQuitadoPrazo = true;																	// atribuindo valores 
		possuiRendaComprovada = true;
		clienteCincoEstrelas = true;
		restricaoCredito = false;
		
		boolean concedeEmprestimo = ( ult3EmprestimoQuitadoPrazo && possuiRendaComprovada || clienteCincoEstrelas) && restricaoCredito; // testando a condiçao
		System.out.printf("Emprestimo concedido: %b", concedeEmprestimo); 

		

	}

}
