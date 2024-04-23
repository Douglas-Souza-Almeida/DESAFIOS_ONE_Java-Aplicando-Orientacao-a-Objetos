package types.screenmatch;

import calculator.screenmatch.Sortable;

public class Episode implements Sortable {
    private int number;
    private String name;
    private Series serie;
    private int totalViews;

    //métodos getter
    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public Series getSerie() {
        return serie;
    }

    public int getTotalViews() {
        return totalViews;
    }

    //métodos setter
    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSerie(Series serie) {
        this.serie = serie;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    @Override
    public int getClassification() {
        if (totalViews > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
