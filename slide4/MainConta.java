public class MainConta {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(22222, 100);
        conta.exibirSaldoAtual();
        conta.depositar(400);
        conta.sacar(1000);
        conta.sacar(100);
        System.out.println("Saldo final de: " + conta.getSaldo());

        
    }
    
}
