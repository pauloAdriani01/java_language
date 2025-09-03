//Classe de métodos feita para a "funcionalidade" da livraria

public class Livraria {
    //Método para a visualização dos atributos presentes em cada objeto livro
    //Utiliza os getters para a exibição de informações privadas
    public void exibirLivro(Livro livro) {
        System.out.print("\n");

        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("ID dentro da livraria: " + livro.getId());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Ano de publicação: " + livro.getAnoPublicacao());

    }
}
