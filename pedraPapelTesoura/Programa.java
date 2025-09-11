public class Programa {
    //Métodos usados para o programa funcionar

    //Passagem de parâmetro para evitar a criação de outro método e perder o valor escolhido
    public void apresentacaoPrograma(Entrada entrada) {
        System.out.println("--- PEDRA, PAPEL OU TESOURA NO CONSOLE ---\n");
        System.out.println("O que você irá escolher?");
        System.out.println("0 --> Pedra");
        System.out.println("1 --> Papel");
        System.out.println("2 --> Tesoura");

        entrada.setEscolhaUsuario();
    }

    public void resultadoJogo(String escolhaJogo, String escolhaSistema) {
        //Condições de empate
        if(escolhaSistema.equals("Pedra") && escolhaJogo.equals("Pedra")) {
            System.out.println("\nEmpate.");
            System.out.println("Escolha do console: " + escolhaSistema);
            System.out.println("Sua escolha: " + escolhaJogo);

        }
        else if(escolhaSistema.equals("Papel") && escolhaJogo.equals("Papel")) {
            System.out.println("\nEmpate.");
            System.out.println("Escolha do console: " + escolhaSistema);
            System.out.println("Sua escolha: " + escolhaJogo);

        }
        else if(escolhaSistema.equals("Tesoura") && escolhaJogo.equals("Tesoura")) {
            System.out.println("\nEmpate.");
            System.out.println("Escolha do console: " + escolhaSistema);
            System.out.println("Sua escolha: " + escolhaJogo);


        }

        //Condições de derrota
        if(escolhaSistema.equals("Papel") && escolhaJogo.equals("Pedra")) {
            System.out.println("\nDerrota.");
            System.out.println("Escolha do console: " + escolhaSistema);
            System.out.println("Sua escolha: " + escolhaJogo);

        }
        else if(escolhaSistema.equals("Tesoura") && escolhaJogo.equals("Papel")) {
            System.out.println("\nDerrota.");
            System.out.println("Escolha do console: " + escolhaSistema);
            System.out.println("Sua escolha: " + escolhaJogo);

        }
        else if(escolhaSistema.equals("Pedra") && escolhaJogo.equals("Tesoura")) {
            System.out.println("\nDerrota.");
            System.out.println("Escolha do console: " + escolhaSistema);
            System.out.println("Sua escolha: " + escolhaJogo);

        }

        //Condições de vitória
        if(escolhaSistema.equals("Pedra") && escolhaJogo.equals("Papel")) {
            System.out.println("\nVitória!");
            System.out.println("Escolha do console: " + escolhaSistema);
            System.out.println("Sua escolha: " + escolhaJogo);


        }
        else if(escolhaSistema.equals("Papel") && escolhaJogo.equals("Tesoura")) {
            System.out.println("\nVitória!");
            System.out.println("Escolha do console: " + escolhaSistema);
            System.out.println("Sua escolha: " + escolhaJogo);


        }
        else if(escolhaSistema.equals("Tesoura") && escolhaJogo.equals("Pedra")) {
            System.out.println("\nVitória!");
            System.out.println("Escolha do console: " + escolhaSistema);
            System.out.println("Sua escolha: " + escolhaJogo);


        }

    }

}
