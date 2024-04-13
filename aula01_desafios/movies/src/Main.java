import activities.Actions;
import models.Movie;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie();
        Actions actions = new Actions(movie);

        movie.setTitle("Inception");
        movie.setMinutes(148);
        movie.setReleaseYear(2010);
        movie.setSynopsis("""
                \"Inception\" é um filme de ficção científica e ação dirigido por Christopher Nolan. A trama gira em torno de Dom Cobb, um habilidoso ladrão que é especializado em roubar informações valiosas do subconsciente das pessoas durante o estado de sono, por meio de uma tecnologia chamada de \"inserção\". No entanto, Cobb enfrenta um desafio maior quando é contratado para realizar a operação inversa: implantar uma ideia na mente de alguém, um processo conhecido como \"inception\".
                Para realizar essa tarefa aparentemente impossível, Cobb e sua equipe entram em um mundo de sonhos dentro de sonhos, criando camadas de realidade onde o tempo passa de maneira diferente e a mente é vulnerável à manipulação. Enquanto navegam por esses labirintos psicológicos, enfrentam não apenas os perigos das projeções subconscientes, mas também os conflitos internos e segredos pessoais de Cobb.
                \"Inception\" é uma jornada intensa e complexa que explora os limites da percepção, da realidade e da mente humana, enquanto mergulha em temas como culpa, redenção e a natureza da própria existência. Com performances marcantes, visuais deslumbrantes e uma trilha sonora arrebatadora, o filme cativa o espectador em uma experiência cinematográfica única e emocionante.""");

        actions.evaluate(9.8);
        actions.evaluate(10);
        actions.evaluate(9);
        actions.evaluate(8.5);
        actions.evaluate(10);
        actions.evaluate(8);

        actions.showTecnichalSheet();

    }
}
