package models;

//criando a classe
public class PersonAge {
    //definindo os atributos
    private String name;
    private int age;

    //métodos getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //métodos setter

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //métodos para verificar idade
    public String checkLegalAge () {
        if (age >= 18) {
            return "Maior de idade.";
        } else {
            return "Menor de idade.";
        }
    }
}
