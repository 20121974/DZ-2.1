public class Car {
    String brand;//марка автомобиля
    String model;//модель
    int productionYear;//год выпуска
    String productionCountry;//страна-производитель
    String color;//цвет
    double engineVolume;//объем двигателя

    public Car(String brand, String model, int productionYear, String productionCountry, String color, double engineVolume) {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (productionYear == 0){
            this.productionYear = 2020;
        }else {
            this.productionYear = productionYear;
        }

        if (productionCountry == null) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (Double.compare(engineVolume, 0) == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    void outputMessage() {
        System.out.println("Марка автомобиля " + brand + ", модель " + model + ", год выпуска " + productionYear +
                ", страна производитель " + productionCountry + ", цвет " + color + ",объем двигателя " + engineVolume);
    }
}
