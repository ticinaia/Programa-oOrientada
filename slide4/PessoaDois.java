public class PessoaDois{
    private String nome;
    private int idade;
    private Endereco endereco;

    public PessoaDois (String nome, int idade, Endereco endereco){
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void mostrarDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Endereço: Rua " + endereco.getRua() + ", nº " + endereco.getNumero());}

}