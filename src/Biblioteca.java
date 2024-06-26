import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nome;
    private String endereco;
    private List<Livro> livros;
    private List<Usuario> usuarios;
    private List<Emprestimo> emprestimos;

    public Biblioteca(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }
    public void removerLivro(Livro livro){
        livros.remove(livro);
    }
    public void registrarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }
    public Livro buscarLivroPorTitulo(String titulo){
        for (Livro livro : livros){
            if (livro.getTitulo().equalsIgnoreCase(titulo)){
                return livro;
            }
        }
        return null;
    }
    public void adicionarEmprestimo(Emprestimo emprestimo){
        emprestimos.add(emprestimo);
    }
    public void removerEmprestimo(Emprestimo emprestimo){
        emprestimos.remove(emprestimo);
    }
    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }
    public List<Livro> buscarLivroPorAutor(String autor){
        List<Livro> resultados = new ArrayList<>();
        for (Livro livro : livros){
            if (livro.getAutor().equalsIgnoreCase(autor)){
                resultados.add(livro);
            }
        }
        return resultados;
    }

}
