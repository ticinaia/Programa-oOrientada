public class Main {
    public static void main(String[] args) {
    contaBancaria conta1 = new contaBancaria();
    contaBancaria conta2 = new contaBancaria();

    conta1.consultarSaldo();
    conta1.depositar(200);
    conta1.sacar(150);
    conta1.consultarSaldo();

    System.out.println("------------------------------");

    conta2.consultarSaldo();
    conta2.depositar(300);
    conta2.sacar(1000);
    conta2.consultarSaldo();
    }
}

