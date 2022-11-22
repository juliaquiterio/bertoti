package escola;
import java.util.List;
import java.util.LinkedList;

public class Secretaria {
    private List<Aluno> alunos = new LinkedList<Aluno>();
    
    
    public void cadastrarPessoa(Aluno aluno){
        alunos.add(aluno);
    }
    
    public List<Aluno> buscarAlunoPorSala(Sala sala){
        List<Aluno> alunosEncontrados = new LinkedList<Aluno>();
        for(Aluno aluno:alunos){
            if (aluno.getSala().comparar(sala)) alunosEncontrados.add(aluno);
            
        }
        return alunosEncontrados;
    }
    
     public Aluno buscarAlunoPorCpf(String cpf){
        for(Aluno aluno:alunos){
            if(aluno.getCpf().equals(cpf)){
                return aluno;
            }
        }
        return null;
     }
  }

        

     
        
    
            
        
        
            
        
    
 
        

        
    
      
  
        
        
    

