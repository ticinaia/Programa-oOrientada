public class MainPessoaEnd {
    public static void main(String[] args) {
        Endereco Um = new Endereco("Tenoné", 100);
        Endereco Dois = new Endereco ("Tapanã", 40);
        PessoaDois p1 = new PessoaDois("Letícia", 20, Um);
        PessoaDois p2 = new PessoaDois("Camila", 18, Dois);

        p1.mostrarDados();
        p2.mostrarDados();
    }
    
}
