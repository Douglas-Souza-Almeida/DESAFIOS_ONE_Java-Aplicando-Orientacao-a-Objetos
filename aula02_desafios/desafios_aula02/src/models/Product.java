package models;

//criando a classe
public class Product {
    //definindo atributos
    private String name;
    private double price;

    //métodos getter
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    //métodos setter
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //métodos para aplicar desconto
    public double applyDiscount(double rate) {
        return price -= ((rate/100)*price);
    }
}
