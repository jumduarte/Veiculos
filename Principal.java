package ClasseAbstrata;

public class Principal {
	
	public static void main(String[] args) {
		System.out.println("---CARRO---");
		Carro porsche = new Carro("BQT-1810","Porsche 718", "branco", 2023);
		porsche.ligar();
		porsche.acelerar();
		porsche.virar();
		porsche.frear();
		
		System.out.println("\n---ONIBUS---");
		Onibus marcopolo = new Onibus("\nYFP-1707","F1", "vermelho", 2023);
		marcopolo.ligar();
		marcopolo.acelerar();
		marcopolo.virar();
		marcopolo.frear();
	}

}