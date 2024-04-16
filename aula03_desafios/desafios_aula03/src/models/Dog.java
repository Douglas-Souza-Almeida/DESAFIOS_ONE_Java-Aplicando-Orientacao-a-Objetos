package models;

public class Dog extends Animal {
    @Override
    public String makeSound() {
        return "Au au!";
    }

    public String wagTail() {
        return "Abanando o rabo...";
    }
}
