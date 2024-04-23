package types.screenmatch;

public class Title {
    //definindo atributos
    private String name;
    private String type;
    private int releaseYear;
    private double sumOfRatings;
    private int totalReviews;
    private boolean includedInThePlan;
    private int timeInMinutes;

    //métodos getter
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public double getRating() {
        return sumOfRatings;
    }

    public boolean isIncludedInThePlan() {
        return includedInThePlan;
    }

    public int getTimeInMinutes() {
        return timeInMinutes;
    }

    public int getTotalReviews() {
        return totalReviews;
    }

    //métodos setter
    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setRating(double rating) {
        this.sumOfRatings = rating;
    }

    public void setIncludedInThePlan(boolean includedInThePlan) {
        this.includedInThePlan = includedInThePlan;
    }

    public void setTimeInMinutes(int timeInMinutes) {
        this.timeInMinutes = timeInMinutes;
    }

    public void setTotalReviews(int totalReviews) {
        this.totalReviews = totalReviews;
    }

    //métodos da classe
    //exibir dados
    public void showData () {
        System.out.println(String.format("""
                Nome: %s
                Tipo: %s
                Ano de lançamento: %d
                Avaliação: %.2f
                Tempo em minutos: %d""", getName(), getType(), getReleaseYear(), getRating(),
                getTimeInMinutes(), getClass()));
    }

    //realizar uma avaliação
    public void evaluate (double rating) {
        sumOfRatings += rating;
        totalReviews++;
    }

    //calular média de avaliações
    public double getAverage() {
        return sumOfRatings / totalReviews;
    }
}
