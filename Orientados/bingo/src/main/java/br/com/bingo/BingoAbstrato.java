package br.com.bingo;

public abstract class BingoAbstrato {
	protected static int MAX = 60;
	protected String[] participantes = new String[MAX];
	public abstract boolean adicionarParticipante(int pos, String nome);
	public abstract int[] getDisponiveis();
	public abstract int sortear();
}
