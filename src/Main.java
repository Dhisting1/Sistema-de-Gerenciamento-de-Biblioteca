import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central", "Rua 1");
        Livro livro1 = new Livro("Java", "Java", "124242");
        Livro livro2 = new Livro("C", "C", "2232323");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        Usuario usuario1 = new Usuario("Lcs", 1, "Centro", "33232342");
        Usuario usuario2 = new Usuario("Fer", 2, "centro", "1234342");

        biblioteca.registrarUsuario(usuario1);
        biblioteca.registrarUsuario(usuario2);

        Funcionario funcionario = new Funcionario("Gon", 1, "recepcionista", biblioteca);

        
    }
}
