public class Aluno {
    String nome;
    int matricula;
    double notaAv1, notaAv2;

    void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nota AV1: " + notaAv1);
        System.out.println("Nota AV2: " + notaAv2);
        System.out.println("Média: " + calculoMedia());
        statusAprovado();
    }
    double calculoMedia() {
        return (notaAv1 + notaAv2) / 2;
    }
    void statusAprovado(){
        double media = calculoMedia();
        if (media >= 7){
            System.out.println("Parabéns, você foi aprovado!");
        }
        else if (media >= 4){
            System.out.println("Você está de prova final, recuperação. Boa sorte!");
        }
        else {
            System.out.println("Sinto muito, você foi reprovado!");
        }
        }
    

    }




