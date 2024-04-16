package types.screenmatch;

public class Title {
    //definindo atributos
    private String name;
    private String type;
    private int releaseYear;
    private double rating;
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
        return rating;
    }

    public boolean isIncludedInThePlan() {
        return includedInThePlan;
    }

    public int getTimeInMinutes() {
        return timeInMinutes;
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
        this.rating = rating;
    }

    public void setIncludedInThePlan(boolean includedInThePlan) {
        this.includedInThePlan = includedInThePlan;
    }

    public void setTimeInMinutes(int timeInMinutes) {
        this.timeInMinutes = timeInMinutes;
    }

    //métodos da classe
    public void showData () {
        System.out.println(String.format("""
                Nome: %s
                Tipo: %s
                Ano de lançamento: %d
                Avaliação: %.2f
                Tempo em minutos: %d""", getName(), getType(), getReleaseYear(), getRating(),
                getTimeInMinutes(), getClass()));
    }
}
