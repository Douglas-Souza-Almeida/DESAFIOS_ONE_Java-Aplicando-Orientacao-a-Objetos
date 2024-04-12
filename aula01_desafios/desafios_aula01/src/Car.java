//importando biblioteca para obter ano vigente
import java.time.LocalDate;

//criando a classe
public class Car {
    //obtém a data atual
    LocalDate currentDate = LocalDate.now();
    //obtém o ano atual
    int currentYear = currentDate.getYear();

    //definindo atributos
    String model;
    int year;
    String color;

    //definindo métodos
    //calculo da idade do carro
    int calculateAge () {
        return currentYear - year;
    }

    //exibir dados
    void displayCarData () {
        System.out.println(String.format("""
                Modelo: %s
                Ano de fabricação: %d
                Cor: %s
                Idade: %d""", model, year, color, calculateAge()));
    }
}
