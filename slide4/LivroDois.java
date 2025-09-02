public class LivroDois {
    private String titulo;
    private String autor;
    private boolean disponivel;

    public LivroDois(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public boolean isDisponivel() {
        return disponivel;
    }
    
    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("O livro '" + this.titulo + "' foi emprestado com sucesso!");
        } else {
            System.out.println("O livro '" + this.titulo + "' já foi emprestado.");
        }
    }
    
    public void devolver() {
        if (!disponivel) {
            disponivel = true;
            System.out.println("O livro '" + this.titulo + "' foi devolvido com sucesso!");
        } else {
            System.out.println("O livro '" + this.titulo + "' já estava disponível.");
        }
    }
}