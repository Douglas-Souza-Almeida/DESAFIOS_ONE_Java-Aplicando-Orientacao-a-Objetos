package models;

public class ModelCar extends Car {
    private String name;
    private String countryOrigin;

    //métodos getter
    public String getName() {
        return name;
    }

    public String getCountryOrigin() {
        return countryOrigin;
    }

    //método setter
    public void setName(String name) {
        this.name = name;
    }

    public void setCountryOrigin(String countryOrigin) {
        this.countryOrigin = countryOrigin;
    }

    //método para exibir os dados
    public void showData () {
        System.out.println(String.format("""
                Nome: %s
                Fabricante: %s
                Origem: %s
                Maior Preço: %.2f
                Menor Preço: %.2f""", name, getManufacturer(), countryOrigin, greaterPrice(),
                lesserPrice()));
    }
}
