public class Livro {
//declaração de variáveis, precisa do tipo de variável antes do nome dela.
    String titulo;
    int numeroPaginas;
    int ano;
    double preco;
    int valorFrete;
//double é o float 
//funções atribuidas á classe.
    void cadastrar(){
        System.out.println("Cadastrando no banco de dados...");
    }
    double calcFrete(String cep){
        System.out.println("Calculando frete para o CEP: " + cep);
        valorFrete = 17;
        return valorFrete;
    }
}

