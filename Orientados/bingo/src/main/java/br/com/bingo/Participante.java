package br.com.bingo;

public class Participante implements Comparable<Participante>{
	private int pos;
	private String nome;
	public Participante(int pos,String nome){
		this.pos = pos;
		this.nome = nome;
	}
	
	
	public int getPos() {
		return pos;
	}


	public void setPos(int pos) {
		this.pos = pos;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int compareTo(Participante o) {
		
		return this.pos - o.pos;
	}
}
