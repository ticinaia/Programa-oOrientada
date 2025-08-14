public class ProjetoLivraria {
public static void main(String[] args) {
//esse tem a função main pois é a classe principal do código, onde eu vou chamar todas as outras.
        Livro obj = new Livro();
//classe Livro; obj é um objeto dentro dessa classe, estou n=usando essa função para declarar que estou adicionando um novo livro na livraria;
        obj.titulo = "Sete Maridos de Evelyn Hugo";
        obj.numeroPaginas = 386;
        obj.ano = 2018;
        obj.preco = 45.90;
//. é para acessar os tributos (caracteristicas) do objeto da classe
        System.out.println("Título: " + obj.titulo);
        System.out.println("Número de Páginas: " + obj.numeroPaginas);
        System.out.println("Ano de Publicação: " + obj.ano);
        System.out.println("Preço: "+ obj.preco);
//aqui são os metodos da classe
        obj.cadastrar();
        double frete = obj.calcFrete("66820105");
        System.out.printf("Frete R$ %.2f", frete);

        Livro objDois = new Livro ();
        objDois.titulo = "Verity";
        objDois.numeroPaginas = 265;
        objDois.ano = 2021;
        objDois.preco = 56.99;

        System.out.println("Título: " + objDois.titulo);
        System.out.println("Número de Páginas: " + objDois.numeroPaginas);
        System.out.println("Ano de Publicação: " + objDois.ano);
        System.out.println("Preço: "+ objDois.preco);

        objDois.cadastrar();
        double freteDois = objDois.calcFrete ("66253106");
        System.out.printf("Frete R$ %.2f", freteDois);
//exercicio dois do slide
        cliente clienteUm = new cliente();
        clienteUm.nome = "Ana Souza";
        clienteUm.idade = 25;
        clienteUm.email = "anasouza@email.com";

        clienteUm.cadastrarNome();
        clienteUm.cadastrarEmail();
        }
}