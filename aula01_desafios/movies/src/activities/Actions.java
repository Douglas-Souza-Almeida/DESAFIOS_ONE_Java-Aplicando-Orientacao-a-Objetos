package activities;

import models.Movie;

//criando a classe
public class Actions {
    private Movie movie;
    public Actions(Movie movie) {
        this.movie = movie;
    }

    //definindo variáveis
    double totalRatings;
    int numberOfReviews;
     /*
     private String title;
    private int releaseYear;
    private int minutes;
    private int numberOfReviews;
    private double totalRatings;
    private boolean included;
    private String synopsis;
     */

    //métodos da classe
    //avaliar filme
    public void evaluate (double rating) {
        totalRatings += rating;
        movie.setTotalRatings(totalRatings);
        numberOfReviews++;
        movie.setNumberOfReviews(numberOfReviews);
    }

    //calculo da média de avaliações
    public double averageRating () {
        return movie.getTotalRatings() / movie.getNumberOfReviews();
    }

    //exibir dados do filme
    public void showTecnichalSheet () {
        System.out.println(String.format("""
                Título: %s
                Ano de lançamento: %d
                Duração: %d minutos
                Média das avaliações: %.2f
                Total de avaliações: %d
                Sinópse: %s""", movie.getTitle(), movie.getReleaseYear(), movie.getMinutes(),
                averageRating(), movie.getNumberOfReviews(), movie.getSynopsis()));
    }
}
