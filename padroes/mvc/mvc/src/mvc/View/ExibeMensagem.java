package mvc.View;

import java.util.List;

import mvc.Model.Mensagem;

public class ExibeMensagem {
    public void exibirMensagens(List<Mensagem> mensagens) {
        System.out.println("Ei! Veja suas mensagens abaixo: ");
        for (Mensagem mensagem : mensagens) {
            System.out.println(mensagem.getRemetente() + ": " + mensagem.getConteudo());
        }
        System.out.println("*************//*************");
    }
}
