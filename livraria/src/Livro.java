//Classe criada para a atribuição de livros

public class Livro {
    //Declaração de atributos da classe
    //Atributos privados para não serem facilmente acessados
    private int id;
    private String titulo;
    private String autor;
    private int anoPublicacao;

    //Constructors da classe
    //Esse constructor é o "padrão", sendo usado para definir características quando nenhuma informação é passada
    public Livro() {
        this(0, null, null, 0);

    }

    //Esse constructor é utilizado quando todos os atributos são declaradas corretamente
    public Livro(int id, String titulo, String autor, int anoPublicacao) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;

    }

    //Setter das informações, utilizado para passar dados dentro do objeto
    public void setLivro(int id, String titulo, String autor, int anoPublicacao) {
        this.id = id;
        this.titulo = titulo;
        this. autor = autor;
        this.anoPublicacao = anoPublicacao;

    }

    //Definição dos getters para exibição de informações privadas
    public int getId() {
        return  id;

    }

    public String getTitulo() {
        return titulo;

    }

    public String getAutor() {
        return autor;

    }

    public int getAnoPublicacao() {
        return anoPublicacao;

    }

}
