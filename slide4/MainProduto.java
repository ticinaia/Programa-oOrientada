public class MainProduto {
    public static void main(String[] args) {
        Produto n1 = new Produto ("Roupas", 122);
        Produto n2 = new Produto ("Celular", 1200);

        n1.exibirDados();
        n1.setPreço(652);

        n2.exibirDados();
        n2.setPreço(-15);
    }
    
}
