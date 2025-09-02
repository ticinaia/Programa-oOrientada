public class Escola {
    public static void main(String[] args) {
        Aluno alunoUm = new Aluno();
        alunoUm.nome = "Angelina";
        alunoUm.matricula = 4186058;
        alunoUm.notaAv1 = 7;
        alunoUm.notaAv2 = 3;
        System.out.println("\nDados do aluno: ");
        alunoUm.mostrarDados();
        System.out.println("\nAtualizando notas...");
        alunoUm.notaAv2 = 5;
        System.out.println ("\n Dados atualizados do aluno: ");
        alunoUm.mostrarDados();
        Aluno alunoDois = new Aluno();
        alunoDois.nome = "Eduarda";
        alunoDois.matricula = 562387;
        alunoDois.notaAv1 = 5;
        alunoDois.notaAv2 = 8;
        System.out.println("\nDados do aluno: ");
        alunoDois.mostrarDados();
    }
}
