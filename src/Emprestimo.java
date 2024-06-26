import java.util.Date;

public class Emprestimo {
    private Livro livro;
    private Usuario usuario;
    private Date dataEmprestimo;
    private Date dataDevolucao;

    public Emprestimo(Livro livro, Usuario usuario, Date dataEmprestimo, Date dataDevolucao){
        this.livro = livro;
        this.usuario = usuario;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public Livro getLivro() {
        return livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }
    public double calcularMulta(){
        long diferencaEmMilesimos = Math.abs(new Date().getTime() - dataDevolucao.getTime());
        long diferenca = diferencaEmMilesimos / (24 * 60 * 60 * 1000);
        return diferenca > 0 ? diferenca * 1.5 : 0.0;
    }
}
