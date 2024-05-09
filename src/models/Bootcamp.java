package models;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Bootcamp {
	public String nome;
	public String duracao;
	public String dataDeInicio;
	public String dataLimite;
	public List<Aluno> alunos;
	public List<Curso> cursos;
	public List<Mentoria> mentorias;
	Scanner sc = new Scanner(System.in);
	
	public Bootcamp() {
		alunos = new ArrayList<>();
		cursos = new ArrayList<>();
		mentorias = new ArrayList<>();
	}
	public void criarBootcamp() {
		System.out.println("Qual o nome do bootcamp?");
		this.nome = sc.nextLine();
		System.out.println("Qual a duração do bootcamp?");
		this.duracao = sc.nextLine();
		System.out.println("Qual a data de início do bootcamp? (dd-MM-yyyy)");
		this.dataDeInicio = sc.nextLine();
		System.out.println("Qual a data limite do bootcamp? (dd-MM-yyyy)");
		this.dataLimite = sc.nextLine();
		System.out.println("Digite o número de cursos que vai ter o bootcamp:");
		int numeroDeCursos = sc.nextInt();
		sc.nextLine();
		for(int i = 0; numeroDeCursos > i; i++) {
			System.out.println("Nome do Curso:");
			String nomeDoCurso = sc.nextLine();
			System.out.println("Descricao do Curso:");
			String descricaoDoCurso = sc.nextLine();
			System.out.println("Cargo horária do Curso:");
			int cargoHoraria = 1;
			try {
			cargoHoraria = sc.nextInt();
			sc.nextLine();
			}catch(InputMismatchException e) {
				System.out.println("Digite apenas números inteiros para a cargo horária do curso!");
				i--;
				sc.nextLine();
			}
			cursos.add(new Curso(nomeDoCurso,descricaoDoCurso,cargoHoraria));
			}
		System.out.println("Cursos inseridos: ");
		for(Curso curso : cursos) {
			System.out.println(curso);
		}
		System.out.println("Digite o número de mentorias que vai ter o bootcamp: ");
		int numeroDeMentorias = sc.nextInt();
		sc.nextLine();
		for(int i = 0; numeroDeMentorias > i; i++) {
			System.out.println("Tiulo da Mentoria:");
			String titulo = sc.nextLine();
			System.out.println("Descrição da Mentoria:");
			String descricao = sc.nextLine();
			System.out.println("Data da Mentoria:");
			String data = sc.nextLine();
			System.out.println("Mentores:");
			String mentores = sc.nextLine();
			mentorias.add(new Mentoria(titulo,descricao,data,mentores));
		}
		System.out.println("Mentorias Inseridas: ");
		for(Mentoria mentoria: mentorias) {
			System.out.println(mentoria);
		}
		int quantidadeDeHorasAula = 0;
		for(Curso curso : cursos) {
			quantidadeDeHorasAula += curso.cargoHoraria;
		}
		int cargoHorariaDoBootcamp = quantidadeDeHorasAula + mentorias.size();
		System.out.println("------------------------------------------");
		System.out.println("--- Bootcamp Criado com Sucesso! ---");
		System.out.println(""
				+ "Nome: " + nome + 
				"\nDuracao: " + duracao + 
				"\nDatade Inicio: " + dataDeInicio + 
				"\nData Limite: " + dataLimite + 
				"\nCargo Horária: " + cargoHorariaDoBootcamp + " hora(s)." );
	}
}
