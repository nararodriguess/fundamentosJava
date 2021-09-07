package projetoAula03_05;

import java.util.*; 

public class classeAula03_05 {

	public static void main(String[] args) {
		// CALCULO IMC
		double peso, altura, imc;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite o peso: ");
		peso = entrada.nextDouble();

		System.out.print("Digite a altura: ");
		altura = entrada.nextDouble();
		
		imc = peso / (altura*altura);
		
		if (imc <= 19)												// Testando condições
			System.out.print("Abaixo do peso");
		else if (imc >19 && imc <=25)
			System.out.print("Peso ideal");
		else if (imc >25 && imc <=30)
			System.out.print("Acima do peso");
		else if (imc >30 && imc <=35)
			System.out.print("Obesidade leve");
		else
			System.out.print("Obesidade");
		
	}

}
