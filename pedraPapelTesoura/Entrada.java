//Importação da classe Scanner para lidar com dados inseridos
import java.util.Scanner;

public class Entrada {
    private String escolhaJogo;
    private int escolhaUsuario;

    //Criação do objeto para aceitar entradas de usuário
    Scanner usuarioEntrada = new Scanner(System.in);


    //setter da informação baseado na informação colocada pelo usuário
    public void setEscolhaUsuario() {
        escolhaUsuario = usuarioEntrada.nextInt();
    }

    public String setEscolhaJogo() {
        if(escolhaUsuario == 0) {
            escolhaJogo = "Pedra";

        }
        else if(escolhaUsuario == 1) {
            escolhaJogo = "Papel";

        }
        else if(escolhaUsuario == 2) {
            escolhaJogo = "Tesoura";

        }
        else {
            System.out.println("\nERRO. Escolha inválida.");
            System.exit(1);

        }

        return escolhaJogo;

    }

    public String getEscolhaJogo() {
        return escolhaJogo;

    }

}
