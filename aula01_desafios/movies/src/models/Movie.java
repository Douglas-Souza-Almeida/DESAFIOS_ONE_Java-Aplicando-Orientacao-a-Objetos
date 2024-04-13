package models;

//criando a classe
public class Movie {
    //definindo os atributos
    private String title;
    private int releaseYear;
    private int minutes;
    private int numberOfReviews;
    private double totalRatings;
    private boolean included;
    private String synopsis;

    //métodos getter
    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getNumberOfReviews() {
        return numberOfReviews;
    }

    public double getTotalRatings() {
        return totalRatings;
    }

    public boolean isIncluded() {
        return included;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    //métodos setter
    public void setTitle(String title) {
        this.title = title;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setNumberOfReviews(int numberOfReviews) {
        this.numberOfReviews = numberOfReviews;
    }

    public void setTotalRatings(double totalRatings) {
        this.totalRatings = totalRatings;
    }

    public String getSynopsis() {
        return synopsis;
    }

    //métodos da classe
    public void evaluate (double rating) {
        totalRatings += rating;
        numberOfReviews++;
    }

    public double averageRating () {
        return totalRatings / numberOfReviews;
    }

    public void showTecnichalSheet () {
        System.out.println(String.format("""
                Título: %s
                Ano de lançamento: %d
                Duração: %d minutos
                Média das avaliações: %.2f
                Total de avaliações: %d""", title, releaseYear, minutes, averageRating(), numberOfReviews));
    }
}
