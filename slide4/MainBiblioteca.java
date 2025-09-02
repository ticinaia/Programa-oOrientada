public class MainBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca(5);

        biblioteca.adicionarLivro(new LivroDois("Dom Casmurro", "Machado de Assis"));
        biblioteca.adicionarLivro(new LivroDois("O Cortiço", "Aluísio Azevedo"));
        biblioteca.adicionarLivro(new LivroDois("Iracema", "José de Alencar"));
        biblioteca.adicionarLivro(new LivroDois("Memórias Póstumas de Brás Cubas", "Machado de Assis"));

        biblioteca.mostrarLivros();
        biblioteca.emprestarLivro("O Cortiço");
        
        biblioteca.emprestarLivro("O Cortiço");
        
        biblioteca.mostrarLivros();
        
        biblioteca.devolverLivro("O Cortiço");
        
        biblioteca.mostrarLivros();
        
        biblioteca.emprestarLivro("Livro Inexistente"); 
        biblioteca.devolverLivro("Dom Casmurro"); 
    }
}