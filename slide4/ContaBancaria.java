public class ContaBancaria{
//declaração de variáveis
    private int numeroConta;
    private double saldo;
//construtor
    public ContaBancaria (int numeroConta, double saldo){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
//getters
    public int getNumeroConta(){
        return numeroConta;
    }
    public double getSaldo(){
        return saldo;
    }
    public void depositar (double valor){
        if (valor> 0){
            saldo+= valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
            } else {
            System.out.println("Valor de depósito inválido!");
        }
        }
    public void sacar (double valor){
        if (valor > 0 && valor <= saldo){
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso");}
        else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
        }
        public void exibirSaldoAtual(){
            System.out.println("Saldo atual da conta é de: " + getSaldo());
        }
    }

