
public class classePrincial {

	public static void main(String[] args) {
		
		carro c1 = new carro();
		c1.setnumPortas(4);
		c1.setMarca("WV");
		c1.setModelo("gol");
		c1.setNumCavalos(1000);
		System.out.printf("Portas: %d\nMarca: %s\nModelo: %s\nCavalos: %d", c1.getnumPortas(), c1.getMarca(), c1.getModelo(), c1.getNumCavalos());

	}

}
