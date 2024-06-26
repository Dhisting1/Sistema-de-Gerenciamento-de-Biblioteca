public class Funcionario {
    private String nome;
    private int id;
    private String cargo;
    private Biblioteca biblioteca;

    public Funcionario(String nome, int id, String cargo, Biblioteca biblioteca) {
        this.nome = nome;
        this.id = id;
        this.cargo = cargo;
    }
    public void registrarLivro(Livro livro){
        biblioteca.adicionarLivro(livro);
    }
    public void removerLivro(Livro livro){
        biblioteca.removerLivro(livro);
    }
    public void registrarUsuario(Usuario usuario){
        biblioteca.registrarUsuario(usuario);
    }
    public void gerarRelatorioEmprestimos(){
        for (Emprestimo emprestimo : biblioteca.getEmprestimos()){
            System.out.println("Usuário: " + emprestimo.getUsuario().getNome());
            System.out.println("Livro: " + emprestimo.getLivro().getTitulo());
            System.out.println("Data de Empréstimo: " + emprestimo.getDataEmprestimo());
            System.out.println("Data de Devolução: " + emprestimo.getDataDevolucao());
            System.out.println("Multa: " + emprestimo.calcularMulta());
            System.out.println("-----------------------------------");
        }
    }
}
