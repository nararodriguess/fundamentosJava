package pacoteAula03_14;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class classeAula03_14 {

	public static void main(String[] args) {
		// Escrevendo em um arquivo
		
		try {																						// tratando exce��es
			FileWriter arquivo = new FileWriter("C:\\Users\\Nara\\saidaDados.txt");					//gera arquivo em local especificado
			PrintWriter escreveArquivo = new PrintWriter(arquivo);									
			
			for (int i = 0; i <1000; i++) {															// escreve no arquivo de 0 at� 999
				escreveArquivo.printf("Valor de i: %d\n", i);
				
			}
			
			escreveArquivo.close();																	// fecha arquivos
			arquivo.close();
			
		}
		catch (IOException e){																		// em caso de exce��es
			System.out.print("Erro de grava��o de arquivo: " + e.getMessage());
			
		}
	System.out.println("Fim da execu��o.");
	
	}
	

}
