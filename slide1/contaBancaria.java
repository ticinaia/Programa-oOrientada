public class contaBancaria {

    String numeroConta;
    String titular;
    double saldo;

    void depositar(double valor){
        if (valor > 0){
            saldo += valor;
            System.out.println("Depósito de: R$" + valor + " realizado com sucesso");
        }
        else{
            System.out.println("Valor de depósito inválido");
        }
    }
    void sacar (double valor){
        if (valor > 0 && saldo >= valor){
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
        } else {System.out.println("Saldo insuficiente ou valor inválido para retirada.");
        };
        }
    void consultarSaldo() {
        System.out.println("Saldo atual da conta " + numeroConta + " (" + titular + "): R$" + saldo);
    }
    }
    

