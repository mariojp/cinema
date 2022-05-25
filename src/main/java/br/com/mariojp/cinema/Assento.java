package br.com.mariojp.cinema;

public class Assento {

	
	private boolean situacao;

	public boolean isSituacao() {
		return situacao;
	}

	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}
	
	
	@Override
	public String toString() {
		return situacao?"B":"S";
	}
}
