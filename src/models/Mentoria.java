package models;

public class Mentoria {
	public String titulo;
	public String descricao;
	public String data;
	public String mentores;
	public double xp = 200;
	
	public Mentoria(String titulo, String descricao, String data, String mentores) {
		this.data = data;
		this.descricao = descricao;
		this.titulo = titulo;
		this.mentores = mentores;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getData() {
		return data;
	}

	public double getXp() {
		return xp;
	}

	public String getMentores() {
		return mentores;
	}

	@Override
	public String toString() {
		return "-------- Mentoria -------- \nTitulo: "+ titulo + "\nData: " + data + "\nMentores: " + mentores;
	}
	
}
