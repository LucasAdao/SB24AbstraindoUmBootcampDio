package models;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	public String nome;
	public List<Mentoria> mentorias;
	public List<Curso> cursos;
	public double xp;
	
	public Aluno() {
		this.cursos = new ArrayList<>();
		this.mentorias = new ArrayList<>();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getXp() {
		return xp;
	}
	public void setXp(double xp) {
		this.xp = xp;
	}
	public void terminarCurso(Curso curso) {
		this.cursos.add(curso);
		this.xp += curso.getXp();
	}
	public void terminarMentoria(Mentoria mentoria) {
		this.mentorias.add(mentoria);
		this.xp += mentoria.getXp();
	}
	
}
