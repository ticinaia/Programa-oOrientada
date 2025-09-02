public class Produto{
    private String nome;
    private double preço;

    public Produto(String nome, double preço){
        this.nome = nome;
        this.preço = preço;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public double getPreço(){
        return preço;
    }
    public void setPreço(double preço){
        System.out.println("\nAjustando preço. .  .");
        if (preço<0){
            System.out.println("Não é possível validar esse preço! !");
        }
        else{
            this.preço = preço;
            System.out.println("Preço ajustado com sucesso.");
            System.out.println("Preço atual: " + this.preço);
        }
    }
    public void exibirDados(){
        System.out.println("Nome do produto: " + this.nome);
        System.out.println("Preço do produto: R$" + this.preço);
    }
}