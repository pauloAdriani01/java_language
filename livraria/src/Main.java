public class Main {
    public static void main(String[] args) {
        //Criação de objetos para a representação dos livros e recebimento dos parâmetros (informações)
        //Objeto "nulo" (apenas exemplo do que acontece quando não são passados parâmetros)
        Livro livroNulo = new Livro();

        //Objetos com atributos adicionados ao passar parâmetros
        Livro metamorfose = new Livro(1, "A Metamorfose", "Franz Kafka", 1915);
        Livro _1964 = new Livro(2, "1964", "George Orwell", 1949);

        //Objeto criado sem a passagem de parâmetros, tendo os dados passados após a criação dele utilizando o setter definido na classe
        Livro alicePaisMaravilhas = new Livro();

        //Passagem de atributos no objeto "alicePaisMaravilhas" com o setter
        alicePaisMaravilhas.setLivro(3, "Alice no País das Maravilhas", "Lewis Carroll", 1865);

        //Criação de objeto para os "métodos" da livraria
        Livraria livraria = new Livraria();

        System.out.println("------ LIVRARIA EM CONSOLE ------");

        System.out.print("\n");

        System.out.println("Olá! Seja bem-vindo ao sistema da nossa livraria!");
        System.out.println("Livros disponíveis:");

        livraria.exibirLivro(livroNulo);
        livraria.exibirLivro(metamorfose);
        livraria.exibirLivro(_1964);
        livraria.exibirLivro(alicePaisMaravilhas);

    }
}