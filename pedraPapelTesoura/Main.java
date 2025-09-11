import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char andamento = 'S';

        //Objetos para utilização do código na classe GerarNumeros, Entrada e Programa
        GerarNumeros gerado = new GerarNumeros();
        Entrada entrada = new Entrada();
        Programa rodarPrograma = new Programa();

        Scanner continuarAndamento = new Scanner(System.in);

        while(andamento == 'S') {
            rodarPrograma.apresentacaoPrograma(entrada);

            entrada.setEscolhaJogo();

            String escolhaJogo = entrada.getEscolhaJogo();
            String escolhaSistema = gerado.gerarEscolha();

            rodarPrograma.resultadoJogo(escolhaJogo, escolhaSistema);

            System.out.print("\n");
            System.out.println("Gostaria de jogar denovo? (S/N)");
            andamento = continuarAndamento.next().charAt(0);

            if(andamento == 'N' || andamento == 'n') {
                System.out.println("\nObrigado por jogar!");

            }
            else if(andamento != 'S' || andamento != 's' && andamento != 'N' || andamento != 'n') {
                System.out.println("\nErro. Opção inválida.");

            }

        }

    }

}

