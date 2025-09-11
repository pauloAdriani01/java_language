//Importação da classe Random para geração de número aleatórios
import java.util.Random;

public class GerarNumeros {
    private int numeroAleatorio;
    private String escolhaSistema;

    //Criação do objeto para geração de números aleatórios
    Random gerarAleatorio = new Random();

    public String gerarEscolha() {
        //Guardar número aleatório gerado em uma variável
        numeroAleatorio = gerarAleatorio.nextInt(3);

        if(numeroAleatorio == 0) {
            escolhaSistema = "Pedra";

        }
        else if(numeroAleatorio == 1) {
            escolhaSistema = "Papel";

        }
        else {
            escolhaSistema = "Tesoura";

        }

        return escolhaSistema;

    }

    //getter da informação para utilização e exibição dela
    public String getEscolhaSistema() {
        return escolhaSistema;

    }

}
