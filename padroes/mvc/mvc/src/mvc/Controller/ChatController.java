package mvc.Controller;

import java.util.ArrayList;
import java.util.List;

import mvc.Model.Mensagem;
import mvc.View.ExibeMensagem;

public class ChatController {
    private List<Mensagem> listaDeMensagens;
    private ExibeMensagem chatView;

    public ChatController(ExibeMensagem chatView) {
        this.listaDeMensagens = new ArrayList<>();
        this.chatView = chatView;
    }

    public void enviarMensagem(String remetente, String conteudo) {
        Mensagem novaMensagem = new Mensagem(remetente, conteudo);
        listaDeMensagens.add(novaMensagem);
        chatView.exibirMensagens(listaDeMensagens);
    }
}
