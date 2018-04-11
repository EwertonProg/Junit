package br.com.gestao_horario_aulas.model;

public class Aula {
	private Integer id;
	private Materia materia;
	private Professor professor;
	private Sala sala;
	private Integer dia;
	private Integer horario;
	
	public Integer getId() {
		return this.id;
	}
	
	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public Integer getDia() {
		return dia;
	}

	public void setDia(Integer dia) {
		this.dia = dia;
	}

	public Integer getHorario() {
		return horario;
	}

	public void setHorario(Integer horario) {
		this.horario = horario;
	}
	
	@Override
	public boolean equals(Object arg0) {
		Aula outra = (Aula) arg0; 
		return this.getId().equals(outra.getId());
	}

}
