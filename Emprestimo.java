package controlelivro;

public class Emprestimo {

    private Pessoa pessoa;
    private Livro livro;

    public Emprestimo(Pessoa pessoa, Livro livro) {
        this.pessoa = pessoa;
        this.livro = livro;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public Livro getLivro() {
        return livro;
    }

    @Override
    public String toString() {
        String texto = "";

        texto += "Nome da pessoa: " + pessoa.getNome();
        texto += "\nNome do livro: " + livro.getNome();
        texto += "\nNome do autor: " + livro.getAutor();

        return texto;

    }
}
