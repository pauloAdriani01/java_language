public class Livraria {
    public void pesquisaLivro(Livro livro) {
        System.out.print("\n");

        System.out.println("Livro: " + livro.titulo);
        System.out.println("ID dentro da livraria: " + livro.id);
        System.out.println("Autor: " + livro.autor);
        System.out.println("Ano de publicação: " + livro.anoPublicacao);
    }
}
