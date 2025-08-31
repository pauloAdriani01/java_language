public class Main {
    public static void main(String[] args) {
        //Criação de objetos para a representação dos livros
        Livro metamorfose = new Livro();
        Livro _1964 = new Livro();
        Livro alicePaisMaravilhas = new Livro();

        //Criação de objetos para a visualização de livros
        Livraria livraria = new Livraria();

        //Atribuição de dados dentro dos objetos
        metamorfose.id = 1;
        metamorfose.titulo = "A Metamorfose";
        metamorfose.autor = "Franz Kafka";
        metamorfose.anoPublicacao = 1915;

        _1964.id = 2;
        _1964.titulo = "1964";
        _1964.autor = "George Orwell";
        _1964.anoPublicacao = 1949;

        alicePaisMaravilhas.id = 3;
        alicePaisMaravilhas.titulo = "Alice no País das Maravilhas";
        alicePaisMaravilhas.autor = "Lewis Carroll";
        alicePaisMaravilhas.anoPublicacao = 1865;

        System.out.println("------ LIVRARIA EM CONSOLE ------");

        System.out.print("\n");

        System.out.println("Olá! Seja bem-vindo ao sistema da nossa livraria!");
        System.out.println("Livros disponíveis:");

        livraria.pesquisaLivro(metamorfose);
        livraria.pesquisaLivro(_1964);
        livraria.pesquisaLivro(alicePaisMaravilhas);
    }
}