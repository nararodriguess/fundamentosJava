package pacoteAula03_13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class classeAula03_13 {

	public static void main(String[] args) {
		// Lendo um arquivo
																										
		try {																							//tratando exceções 
			FileReader arquivo = new FileReader("C:\\Users\\Nara\\arquivoAula03_13.txt"); 				//passa para o programa o local do arquivo
			BufferedReader lerArquivo = new BufferedReader(arquivo); 									
			
			String linha;																				// fazer a leitura do arquivo
			linha = lerArquivo.readLine(); 																// le a primeira linha completa do arquivo
			
			
			while (linha != null) {																		//le todas as linhas ate não ter mais
				
				
				String[] dadosCliente = new String[5];													// cria um array para separar a linha por ';'
				dadosCliente = linha.split(";"); 														// separa a linha por ';'
				
				
				System.out.printf("Cod do cliente: %s.\n" +												// imprime de forma organizada
						 "Nome: %s.\n" +
						 "Endereço: %s.\n" +
						 "Cidade: %s.\n" +
						 "Estado Civil: %s.\n", dadosCliente[0], dadosCliente[1], dadosCliente[2], dadosCliente[3], dadosCliente[4]);
				

				System.out.println();																		//cria uma linha em branco
				linha = lerArquivo.readLine();																// le a proxima linha do arquivo		
			}
			lerArquivo.close();																			//fecha os dois objetos para liberar o arquivo
			arquivo.close();
			
		
		} catch (IOException e ){																		// caso ocorra exceção
			System.out.println("Erro leitura de dados: " + e.getMessage());
		}

	}

}
