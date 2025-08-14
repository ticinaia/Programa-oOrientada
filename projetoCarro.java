public class projetoCarro {
    public static void main(String[] args) {
    carro objUm = new carro();
    objUm.marca = "Toyota";
    objUm.modelo = "aham";
    objUm.ano = 2015;

    carro objDois = new carro();
    objDois.marca = "BYD";
    objDois.modelo = "amarelo";
    objDois.ano = 2024;

    objUm.mostrarDados();
    System.out.println("Atualizando os dados...");
    objUm.modelo = "Verde 35";
    objUm.mostrarDados();
    System.out.println("Dados atualizados.");
    }
    
}
