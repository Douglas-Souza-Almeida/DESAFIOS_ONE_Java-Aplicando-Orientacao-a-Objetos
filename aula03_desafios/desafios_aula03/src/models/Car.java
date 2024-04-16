package models;

public class Car {
    private String manufacturer;
    private double priceYear1;
    private double priceYear2;
    private double priceYear3;

    //métodos getter
    public String getManufacturer() {
        return manufacturer;
    }

    public double getPriceYear1() {
        return priceYear1;
    }

    public double getPriceYear3() {
        return priceYear3;
    }

    public double getPriceYear2() {
        return priceYear2;
    }

    //métodos setter
    public void setManufacturer(String model) {
        this.manufacturer = model;
    }

    public void setPriceYear1(double priceYear1) {
        this.priceYear1 = priceYear1;
    }

    public void setPriceYear2(double priceYear2) {
        this.priceYear2 = priceYear2;
    }

    public void setPriceYear3(double priceYear3) {
        this.priceYear3 = priceYear3;
    }

    //verificar o maior
    public double greaterPrice () {
        if (priceYear1 > priceYear2 && priceYear1 > priceYear3) {
            return priceYear1;
        } else {
            if (priceYear2 > priceYear3) {
                return priceYear2;
            } else {
                return priceYear3;
            }
        }
    }

    //verificar o menor
    public double lesserPrice () {
        if (priceYear1 < priceYear2 && priceYear1 < priceYear3) {
            return priceYear1;
        } else {
            if (priceYear2 < priceYear3) {
                return priceYear2;
            } else {
                return priceYear3;
            }
        }
    }

}
