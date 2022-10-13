package classeAbstrata;

public interface ControleRemoto {
    // interface nao tem atributos
    // interface nao tem construtor
    // nao tem get e set
    // so tem cabecalho de metodos
    // E cada metodo termina com um ponto-e-vergula (;)
	
/*
 * mudar de canal, aumentar volume, diminuir volume, ligar/desligar.
 */
	public void mudaCanal (int novoCanal);
	public void aumentaVolume ();
	public void diminuiVolume();
	public void ligarDesligar ();
    public void aumentarCanal();
    public void diminuirCanal();

}
