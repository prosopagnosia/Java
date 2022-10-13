package classeAbstrata;

import io.InOut;

public class AppTv {

	public static void main(String[] args) {
		Tv001 tvSimples = new Tv001(110, 42);
		TvSdx tvSdx = new TvSdx(110, 45);
		
		tvSimples.ligar();
		tvSdx.ligar();
		int canal = InOut.leInt("Entre com o canal");
		tvSimples.mudaCanal(canal);
		for (int i=0; i<5; i++) {
			tvSdx.aumentaVolume();
		}
		tvSimples.desligar();
		
		if (tvSimples.isLigado()){
			System.out.println ("A TV simples esta ligada");
			tvSimples.desligar();
		}
		if (tvSdx.isLigado()){
			System.out.println ("A TV SDX esta ligada");
			tvSdx.desligar();		
		}
	}
}
