public class Biblioteca {
    private LivroDois[] livros;
    private int contador;
    
    public Biblioteca(int capacidade) {
        livros = new LivroDois[capacidade];
        contador = 0;
    }
    
    public void adicionarLivro(LivroDois livro) {
        if (contador < livros.length) {
            livros[contador] = livro;
            contador++;
            System.out.println("Livro adicionado: " + livro.getTitulo());
        } else {
            System.out.println("Biblioteca cheia! Não foi possível adicionar o livro: " + livro.getTitulo());
        }
    }
    
    public void emprestarLivro(String titulo) {
        for (int i = 0; i < contador; i++) {
            if (livros[i].getTitulo().equalsIgnoreCase(titulo)) {
                livros[i].emprestar();
                return;
            }
        }
        System.out.println("Livro não encontrado: " + titulo);
    }
    
    public void devolverLivro(String titulo) {
        for (int i = 0; i < contador; i++) {
            if (livros[i].getTitulo().equalsIgnoreCase(titulo)) {
                livros[i].devolver();
                return;
            }
        }
        System.out.println("Livro não encontrado: " + titulo);
    }
    
    public void mostrarLivros() {
        System.out.println("\n--- LIVROS NA BIBLIOTECA ---");
        for (int i = 0; i < contador; i++) {
            String status = livros[i].isDisponivel() ? "Disponível" : "Emprestado";
            System.out.println("Título: " + livros[i].getTitulo() + " | Autor: " + livros[i].getAutor() + " | Status: " + status);
        }
    }
}