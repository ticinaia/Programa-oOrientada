public class MainBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca(5);

        biblioteca.adicionarLivro(new LivroDois("Dom Casmurro", "Machado de Assis"));
        biblioteca.adicionarLivro(new LivroDois("O Cortiço", "Aluísio Azevedo"));
        biblioteca.adicionarLivro(new LivroDois("Iracema", "José de Alencar"));
        biblioteca.adicionarLivro(new LivroDois("Memórias Póstumas de Brás Cubas", "Machado de Assis"));

        biblioteca.mostrarLivros();
        
        System.out.println("\n--- TENTANDO EMPRESTAR UM LIVRO ---");
        biblioteca.emprestarLivro("O Cortiço");
        
        System.out.println("\n--- TENTANDO EMPRESTAR O MESMO LIVRO NOVAMENTE ---");
        biblioteca.emprestarLivro("O Cortiço");
        
        biblioteca.mostrarLivros();
        
        System.out.println("\n--- DEVOLVENDO O LIVRO ---");
        biblioteca.devolverLivro("O Cortiço");
        
        biblioteca.mostrarLivros();
        
        System.out.println("\n--- TESTES ADICIONAIS ---");
        biblioteca.emprestarLivro("Livro Inexistente"); 
        biblioteca.devolverLivro("Dom Casmurro"); 
    }
}