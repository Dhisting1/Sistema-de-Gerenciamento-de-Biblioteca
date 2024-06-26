import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private int id;
    private String endereco;
    private String telefone;
    private String usuarios;
    private List<Emprestimo> emprestimos;

    public Usuario(String nome, int id, String endereco, String telefone) {
        this.nome = nome;
        this.id = id;
        this.endereco = endereco;
        this.telefone = telefone;
        this.usuarios = usuarios;
        this.emprestimos = new ArrayList<>();
    }
    public void devolverLivro(Livro livro){
        for (Emprestimo emprestimo : emprestimos){
            if (emprestimo.getLivro().equals(livro)){
                emprestimo.getLivro().devolver();
                emprestimos.remove(emprestimo);
                break;
            }
        }
    }

    public String getUsuarios() {
        return usuarios;
    }

    public String getNome() {
        return nome;
    }
}
