package classeAbstrata;

import java.util.ArrayList;

public class AppEletrodomestico {

	public static void main(String[] args) {
		ArrayList<Eletrodomestico> cadEletro = new ArrayList<>();
		
		cadastra (cadEletro);
		liga (cadEletro);
		sintonizaRadio (cadEletro);
		mudaCanalDeTv (cadEletro);
		desligaLavadora (cadEletro);
		imprime (cadEletro);
	}

	private static void cadastra(ArrayList<Eletrodomestico> cadEletro) {
		cadEletro.add(new Tv(110,29));
		cadEletro.add(new Radio(110));
		cadEletro.add(new MaquinaDeLavar(110));
	}

	private static void liga(ArrayList<Eletrodomestico> cadEletro) {
		for (Eletrodomestico eletro: cadEletro) {
			eletro.ligar();  // polimorfismo
		}
		
	}

	private static void sintonizaRadio(ArrayList<Eletrodomestico> cadEletro) {
		for (Eletrodomestico eletro: cadEletro) {
			if (eletro instanceof Radio) {  // testa se objeto e foi instanciado como Radio
				if (eletro.isLigado()) {
					Radio r = (Radio) eletro;   // casting 
					r.setVolume(15);
					r.setSintonia(101.5);
					eletro.setVoltagem(220);
				}
			}
		}
		
	}

	private static void mudaCanalDeTv(ArrayList<Eletrodomestico> cadEletro) {
		for (Eletrodomestico eletro: cadEletro) {
			if (eletro instanceof Tv) {
				if (eletro.isLigado()) 
					((Tv) eletro).setCanal(12);
			}
		}
	}


	private static void imprime(ArrayList<Eletrodomestico> cadEletro) {
		for (Eletrodomestico eletro: cadEletro) {
			System.out.println(eletro.toString());// polimorfismo
		}
		
	}

	private static void desligaLavadora(ArrayList<Eletrodomestico> cadEletro) {
		for (Eletrodomestico eletro: cadEletro) {
			if (eletro instanceof MaquinaDeLavar) {
				eletro.desligar();// polimorfismo
			}
		}
		
	}

}
