import escola.Aluno;
import escola.Sala;
import escola.Secretaria;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class Teste {
    
    public void test() {
        
        Secretaria secretaria = new Secretaria();
        
        assertEquals(secretaria.getAlunos().size(),0);
        
        secretaria.cadastrarAluno(new Aluno("12345678910", new Sala("Banco de Dados", "LP1", "Adriana")));
        secretaria.cadastrarAluno(new Aluno("12345678922", new Sala("Logistica", "Calculo", "Dercy")));
        
        assertEquals(secretaria.getAlunos().size(),2);
        
        Aluno alunoEncontrado = secretaria.buscarAlunoPorCpf("12345678922");
      
        assertEquals(alunoEncontrado.getSala().getMateria()  ,"Calculo");
        
        List<Aluno> alunosEncontrados = secretaria.buscarAlunoPorSala(new Sala("Banco de Dados", "LP1", "Adriana" ));
        
        assertEquals(alunosEncontrados.get(0).getSala().getMateria()  ,"LP1");
        
        
        
        
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
    

    
}
