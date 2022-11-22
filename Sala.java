package escola;

public class Sala {
    private String classe;
    private String materia;
    private String professor;

    public String getClasse() {
        return classe;
    }

    public void setClasse(String novaClasse) {
        this.classe = classe;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String novaMateria) {
        this.materia = materia;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String novoProfessor) {
        this.professor = professor;
    }
    
    public boolean comparar(Sala salaa){
        if(classe.equals(salaa.classe)
           && materia.equals(salaa.materia)
           && professor.equals(salaa.professor)){
            return true;
            
        }else{
            return false;
        }
    }
}
            
    
    

