package models;

public class Cat extends Animal {
    @Override
    public String makeSound() {
        return "Miau!";
    }

    public String scratch() {
        return "Arranhando os móveis";
    }
}
