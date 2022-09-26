public class flower {
    private String name;
    private String flowerColor;//Цвет цветка
    private String country;//Страна происхождения
    private double cost;//Стоимость
    int lifeSpan;//Срок стояния, указанный в целых днях

    public flower(String name, String flowerColor, String country, double cost, int lifeSpan) {
        this.name = name;
        this.flowerColor = flowerColor;
        this.country = country;
        this.cost = cost;
        this.lifeSpan = lifeSpan;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = flowerColor;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getName() {
        if (name == null && name.isBlank() && name.isEmpty()) {
            this.name = "Цветок";
        }else {
            this.name = name;
        }
        return name;
    }

    public String getFlowerColor() {
        if (flowerColor == null) {
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }
        return flowerColor;
    }

    public String getCountry() {
        if (country == null && country.isBlank() && country.isEmpty()) {
            this.country = "Россия";
        }else {
            this.country = country;
        }
        return country;
    }

    public double getCost() {
        if (cost <= 0) {
            this.cost = 1;
        }else
            this.cost = cost;
        return cost;
    }

    public int getLifeSpan() {
        if (lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
        return lifeSpan;
    }
    void outputMessage() {
        System.out.println("Название цветка " + getName() + " Цвет цветка " + getFlowerColor() + ", Страна происхождения " + getCountry() +
        ", Стоимость " + getCost() + ", Срок стояния " + getLifeSpan());
    }
}