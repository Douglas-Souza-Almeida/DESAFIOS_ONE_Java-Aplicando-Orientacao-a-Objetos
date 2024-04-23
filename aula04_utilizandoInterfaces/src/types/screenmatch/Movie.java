package types.screenmatch;

import calculator.screenmatch.Sortable;

public class Movie extends Title implements Sortable {
    //atributos da classe
    private String category;

    //métodos geter e setter
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    //método da interface
    @Override
    public int getClassification() {
        return (int) getAverage() / 2;
    }
}
