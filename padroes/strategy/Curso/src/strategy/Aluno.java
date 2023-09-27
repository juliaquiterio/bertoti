package strategy;

public class Aluno {
	private String nome;
	private String sexo;
	private String situacao;
	
	private Curso curso;
	
	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public void fazerCurso() {
		curso.cursar();
		}

}
