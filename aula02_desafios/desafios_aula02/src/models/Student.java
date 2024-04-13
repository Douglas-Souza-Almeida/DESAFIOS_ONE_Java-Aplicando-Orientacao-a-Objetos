package models;

//criando a classe
public class Student {
    //definindo atributos
    private String name;
    private double scores;
    private int gradeCouting;

    //métodos getter
    public String getName() {
        return name;
    }

    public double getScores() {
        return scores;
    }

    //métodos setter
    public void setScores(double scores) {
        this.scores += scores;
        gradeCouting++;
    }

    public void setName(String name) {
        this.name = name;
    }

    //método para calcular a média
    public double calculateMean () {
        return scores / gradeCouting;
    }
}
