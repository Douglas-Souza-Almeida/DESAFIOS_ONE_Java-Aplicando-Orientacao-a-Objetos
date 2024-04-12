//criando a classe Movie
//definindo atributos da classe
public class Movie {
    String name;
    int releaseYear;
    int durationInMinutes;
    boolean includedInThePlan;
    double sumOfRatings;
    int totalReviews;

    //definindo métodos da classe
    //método para avaliação
    void evaluate (double note) {
        sumOfRatings += note;
        totalReviews++;
    }

    //método para calcular a média de avaliações
    double averageRating () {
        return sumOfRatings / totalReviews;
    }

    //método para exibir dados do filme
    void showsTechnicalSheet () {
        System.out.println(String.format("""
                Nome: %s
                Ano de lançamento: %d
                Duração: %d minutos
                Média das avaliações: %.2f""", name, releaseYear, durationInMinutes, averageRating()));
    }
}
