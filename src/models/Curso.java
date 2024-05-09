package models;

public class Curso {
	public String titulo;
	public String descricao;
	public int cargoHoraria;
	public double xp = 50*cargoHoraria;
	
	public Curso(String titulo,String descricao,int cargoHoraria) {
		this.titulo = titulo;
		this.descricao= descricao;
		this.cargoHoraria = cargoHoraria;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getCargoHoraria() {
		return cargoHoraria;
	}
	public double getXp() {
		return xp;
	}
	
	@Override
	public String toString() {
		return "---------------- " + titulo.toUpperCase() + " ----------------" +"\nDescrição: " + descricao + "\nCargo Horária: " + cargoHoraria + " Hora(s)."  ;
	}
	
	
}
