package singleton;

public class ConfiguracaoSistema {
    private static ConfiguracaoSistema instancia;
    private String idioma;

    private ConfiguracaoSistema() {
    }

    public static ConfiguracaoSistema getInstance() {
        if (instancia == null) {
            instancia = new ConfiguracaoSistema();
        }
        return instancia;
    }

    public void setIdioma(String novoIdioma) {
        this.idioma = novoIdioma;
    }

    public String getIdioma() {
        return idioma;
    }

    public static void main(String[] args) {
        ConfiguracaoSistema configuracao = ConfiguracaoSistema.getInstance();
        configuracao.setIdioma("Inglês");

        System.out.println("Idioma atual: " + configuracao.getIdioma());

        ConfiguracaoSistema outraInstancia = ConfiguracaoSistema.getInstance();
        System.out.println("Idioma na outra instância: " + outraInstancia.getIdioma());
    }
}
