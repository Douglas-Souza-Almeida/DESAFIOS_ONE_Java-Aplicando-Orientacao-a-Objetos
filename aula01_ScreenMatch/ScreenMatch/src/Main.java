/*
Agora é com você! Faça o mesmo procedimento que eu fiz na aula, criando o projeto ScreenMatch no IntelliJ, sendo que
nele você deve criar a classe Filme, contendo os atributos nome, anoDeLancamento, duracaoEmMinutos, incluidoNoPlano,
somaDasAvaliacoes e totalDeAvaliacoes, além de também conter os métodos exibeFichaTecnica, avalia e pegaMedia
Além disso, crie também uma outra classe contendo o método main, no qual você deve criar um objeto Filme, preencher
seus atributos e chamar seus métodos.
 */

public class Main {
    public static void main(String[] args) {
        //criando o objeto
        Movie movie = new Movie();

        //atribuindo valores aos atributos
        movie.name = "Avatar: O caminho das águas";
        movie.releaseYear = 2022;
        movie.durationInMinutes = 192;
        movie.includedInThePlan = true;

        //acessando os métodos da classe Movie
        //atribuindo notas de avaliação
        movie.evaluate(8);
        movie.evaluate(10);
        movie.evaluate(9);
        movie.evaluate(7);
        movie.evaluate(6);
        movie.evaluate(10);
        movie.evaluate(7.5);

        //exibindo dados do filme
        movie.showsTechnicalSheet();
    }
}
