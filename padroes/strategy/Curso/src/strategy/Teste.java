package strategy;

public class Teste {
	
	public static void main(String[] args) {
		
		Aluno claudinho = new Aluno();
		
		claudinho.setCurso(new BancoDados());
		
		claudinho.fazerCurso();

		claudinho.setCurso(new AnaliseDevSistemas());
		
		claudinho.fazerCurso();
		
	}

}
