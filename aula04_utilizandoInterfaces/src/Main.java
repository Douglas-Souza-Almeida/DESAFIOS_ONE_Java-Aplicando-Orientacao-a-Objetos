import calculator.screenmatch.Calculator;
import calculator.screenmatch.RecomendationFilter;
import types.screenmatch.Episode;
import types.screenmatch.Movie;
import types.screenmatch.Series;

import java.security.spec.EdDSAParameterSpec;

public class Main {
    public static void main(String[] args) {
        //instanciando objetos
        Movie parasita = new Movie();
        Movie cidadeDeDeus = new Movie();
        Series gameOfThrones = new Series();
        Calculator calculator = new Calculator();
        Episode episode = new Episode();
        RecomendationFilter recomendationFilter = new RecomendationFilter();

        //atribuindo dados
        parasita.setName("Parasita");
        parasita.setType("Filme");
        parasita.setReleaseYear(2019);
        parasita.setCategory("Suspense");
        parasita.setRating(8.6);
        parasita.setTimeInMinutes(132);
        parasita.setIncludedInThePlan(true);

        //atualizando tempo para maratonar
        calculator.totalTime(parasita);

        cidadeDeDeus.setName("Cidade de Deus");
        cidadeDeDeus.setType("Filme");
        cidadeDeDeus.setReleaseYear(2002);
        cidadeDeDeus.setTimeInMinutes(130);
        cidadeDeDeus.setRating(8.6);
        cidadeDeDeus.setCategory("Drama");
        cidadeDeDeus.setIncludedInThePlan(true);

        //atualizando tempo para maratonar
        calculator.totalTime(cidadeDeDeus);

        gameOfThrones.setName("Game Of Thrones");
        gameOfThrones.setType("Série");
        gameOfThrones.setReleaseYear(2011);
        gameOfThrones.setTotalSeasons(8);
        gameOfThrones.setEpisodesPerSeasons(9);
        gameOfThrones.setEpisodeRuntime(55);
        gameOfThrones.setRating(9.3);
        gameOfThrones.setIncludedInThePlan(true);

        //atualizando calculo para maratonar
        calculator.totalTime(gameOfThrones);

        //dados do episodio
        episode.setNumber(1);
        episode.setSerie(gameOfThrones);
        episode.setTotalViews(300);


        //exibindo dados
        parasita.showData();
        recomendationFilter.filter(parasita);//aplicando filtro com auxilio de interface na classe RecomendationFilter
        System.out.println("-----------------------------------");
        cidadeDeDeus.showData();
        recomendationFilter.filter(cidadeDeDeus);//aplicando filtro com auxilio de interface na classe RecomendationFilter
        System.out.println("-----------------------------------");
        gameOfThrones.showData();
        System.out.println(String.format("Classificação: %d",episode.getClassification()));//exibindo a classificação método com auxílio da interface
        System.out.println("-----------------------------------");
        //exibindo tempo para maratonar
        System.out.println("Tempo total para maratonar: " + calculator.getTotaltime());


    }
}
