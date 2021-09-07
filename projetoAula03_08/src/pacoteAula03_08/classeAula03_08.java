package pacoteAula03_08;

public class classeAula03_08 {

	public static void main(String[] args) {
		int i = 0, j = 0, k = 0;
		
		//for (inicialização; condição; incremento(i++, i+=2, i--){}
		for (i = 1; i <= 10; i++ ) {
			System.out.printf("TABUADA DO %d\n", i);
			for (j = 1; j <= 10; j++) {
				System.out.printf("%d * %d = %d\n" , i, j, i*j);
			}
		}
		//for (i=10; i>=0; i-=2) {
			//System.out.printf("O valor de i decrescente: %d.\n", i);
		//}

	}

}
