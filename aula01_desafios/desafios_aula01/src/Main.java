import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);

        /*
        01. Crie uma classe Pessoa com um método que exibe "Olá, mundo!" no console.
         */
        System.out.println("01. Crie uma classe Pessoa com um método que exibe \"Olá, mundo!\" no console.");
        //criando o objeto
        Person person = new Person();
        //exibindo a mensagem na tela com o método criado
        person.message();

        /*
        02. Crie uma classe Calculadora com um método que recebe um número como parâmetro e retorna o dobro desse
        número.
         */
        System.out.println("02. Crie uma classe Calculadora com um método que recebe um número como parâmetro e " +
                "retorna o dobro desse número.");
        //criando o objeto
        Calculator twice = new Calculator();
        //solicitando que o usuário informe um número
        System.out.printf("Informe um número: ");
        //exibindo resultado do dobro na tela
        System.out.println("O dobro deste número é: " + twice.twice(reading.nextDouble()));

        /*
        03. Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos
         para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.
         */
        System.out.println("03. Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e " +
                "numAvaliacoes, e métodos para exibir a ficha técnica, avaliar a música e calcular a média de " +
                "avaliações.");
        //criando o objeto
        Music music = new Music();

        //atribuindo valores para atributos
        music.title = "Pride and Joy";
        music.artist = "Stevie Ray Vaughan";
        music.releaseYear = 1983;

        music.toAsses(10);
        music.toAsses(9.9);
        music.toAsses(8);
        music.toAsses(10);
        music.toAsses(7);
        music.toAsses(10);

        //exibindo dados na tela
        music.displaySongData();

        /*
        05. Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a
        idade do carro.
         */
        System.out.println("05. Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha " +
                "técnica e calcular a idade do carro.");
        //instanciando o objeto
        Car car = new Car();

        //atribuindo valores aos atributos
        car.model = "Variant";
        car.year = 1960;
        car.color = "Amarelo";

        //exibindo dados do carro na tela
        car.displayCarData();

        /*
        Crie uma classe Aluno com atributos nome, idade, e um método para exibir informações. Crie uma instância da
        classe Aluno, atribua valores aos seus atributos e utilize o método para exibir as informações.
         */
        System.out.println("05. Crie uma classe Aluno com atributos nome, idade, e um método para exibir informações." +
                " Crie uma instância da classe Aluno, atribua valores aos seus atributos e utilize o método para " +
                "exibir as informações.");
        //criando o objeto
        Student student = new Student();

        //atribuindo valores aos atributos
        student.name = "Gustavo Costa Silva Jr.";
        student.age = 17;

        //exibindo dados do aluno na tela
        student.displayStudentData();
    }
}
