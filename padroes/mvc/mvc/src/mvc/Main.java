package mvc;

import java.util.Scanner;

import mvc.Controller.ChatController;
import mvc.View.ExibeMensagem;

public class Main{
    public static void main(String[] args) {
        ExibeMensagem chatView = new ExibeMensagem();
        ChatController chatController = new ChatController(chatView);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Digite o nome do remetente (ou 'sair' para encerrar):");
            String remetente = scanner.nextLine();

            if (remetente.equalsIgnoreCase("sair")) {
                System.out.println("Saindo do chat...");
                break;
            }

            System.out.println("Digite a mensagem:");
            String conteudo = scanner.nextLine();

            chatController.enviarMensagem(remetente, conteudo);
        }

        scanner.close();
    }
}
