//criando a classe
public class Music {

    //definindo atributos
    String title;
    String artist;
    int releaseYear;
    double assessments;
    int numberOfReviews;

    //definindo métodos
    //avaliar
    void toAsses (double note) {
        assessments += note;
        numberOfReviews++;
    }

    //calcular média
    double calculateAverage () {
        return assessments / numberOfReviews;
    }

    //exibir dados
    void displaySongData () {
        System.out.println(String.format("""
                Título: %s
                Artista; %s
                Ano de lançamento: %d
                Média das avaliações: %.2f""", title, artist, releaseYear, calculateAverage()));
    }
}
