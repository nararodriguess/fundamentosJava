package projetoAula02_09;

import java.math.*;

public class classeAula02_09 {

	public static void main(String[] args) {
		// x^2 + 12x - 13 = 0
		// 2x^2-16x-18 = 0
		
		double a, b, c ;											   //declarando tipo das variaveis#
		a = 1;															// atribuindo valores
		b = 12;
		c = -13;
		
		double delta = 0;
		delta = (b * b) - 4 * a * c;									// atribuindo ao delta o calculo matem�tico
		System.out.printf("Delta: %.2f\n", delta);						// mostra na tela
		
		double xLinha, xDuasLinhas;
		xLinha = (-b + Math.sqrt(delta)) / 2*a;
		xDuasLinhas = ( -b - Math.sqrt(delta)) / 2*a;
		
		System.out.printf("X': %.0f: \nX'': %.0f ", xLinha, xDuasLinhas);
		
		
		

		
	}

}
