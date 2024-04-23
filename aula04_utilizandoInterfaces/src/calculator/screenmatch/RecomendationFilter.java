package calculator.screenmatch;

public class RecomendationFilter {
    private String recomendation;

    public void filter(Sortable sortable) {
        if (sortable.getClassification() >= 4) {
            System.out.println("Está entre os preferidos do momento!");
        } else if (sortable.getClassification() >= 2) {
            System.out.println("Muito bem avaliado até o momento!");
        } else {
            System.out.println("Coloque em sua lista para assistir depois!");
        }
    }
}
