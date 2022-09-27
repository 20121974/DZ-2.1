package transport;

public class Car {

    public class insurance {
        private Integer insuranceValidityPeriod;//Срок действия страховки
        private String theCostOfInsurance;//Стоимость страховки
        private String insuranceNumber;//Номер страховки

        public insurance(Integer insuranceValidityPeriod, String theCostOfInsurance, String insuranceNumber) {
            this.insuranceValidityPeriod = insuranceValidityPeriod;
            this.theCostOfInsurance = theCostOfInsurance;
            this.insuranceNumber = insuranceNumber;
        }
        public Integer getInsuranceValidityPeriod() {
            if (insuranceValidityPeriod == 0) {
                System.out.println("нужно срочно ехать оформлять новую страховку");
            } else {
                this.insuranceValidityPeriod = insuranceValidityPeriod;
            }
            return insuranceValidityPeriod;
        }
        public String getTheCostOfInsurance() {
            if (theCostOfInsurance == null && theCostOfInsurance.isBlank() && theCostOfInsurance.isEmpty()) {
                this.theCostOfInsurance = "Стоимость страховки введена некорректно";
            }else {
                this.theCostOfInsurance = theCostOfInsurance;
            }
            return theCostOfInsurance;
        }
        public String getInsuranceNumber() {
            if (insuranceNumber == null && insuranceNumber.isBlank() && insuranceNumber.isEmpty()) {
                this.insuranceNumber = "Номер страховки некорректный";
            }else {
                this.insuranceNumber = insuranceNumber;
            }
            return insuranceNumber;
        }
        public Integer checkingTheExpirationDateOfInsurance(Integer insuranceValidityPeriod) {
            if (insuranceValidityPeriod == 0 && insuranceValidityPeriod == null) {
                System.out.println("нужно срочно ехать оформлять новую страховку");
            } else {
                this.insuranceValidityPeriod = insuranceValidityPeriod;
            }
            return insuranceValidityPeriod;
        }
        public String checkingInsuranceNumber (String insuranceNumber){
            if (insuranceNumber.length() != 9){
                insuranceNumber = "Номер страховки некорректный!";
            }else {
                insuranceNumber = insuranceNumber;
            }
            return insuranceNumber;
        }
    }
    public class key {
        private String remoteEngineStart;//удалённый запуск двигателя
        private String keylessAccess;//бесключевой доступ

        public key(String remoteEngineStart, String keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }
        public String getRemoteEngineStart() {
            if (remoteEngineStart == null && remoteEngineStart.isBlank() && remoteEngineStart.isEmpty()) {
                this.remoteEngineStart = "Ошибка";
            }else {
                this.remoteEngineStart = registrationNumber;
            }
            return remoteEngineStart;
        }
        public String getKeylessAccess() {
            if (keylessAccess == null && keylessAccess.isBlank() && keylessAccess.isEmpty()) {
                this.keylessAccess = "Ошибка";
            }else {
                this.keylessAccess = keylessAccess;
            }
            return keylessAccess;
        }
    }
    private String brand;//марка автомобиля
    private String model;//модель
    private int productionYear;//год выпуска
    private String productionCountry;//страна-производитель
    String color;//цвет
    double engineVolume;//объем двигателя
    String transmission;//коробка передач
    private String bodyType;//тип кузова
    String registrationNumber;//регистрационный номер
    private int numberOfSeats;//количество мест
    String aSignOfSummerOrWinterTires;//признак летняя или зимняя резина

    public Car(String brand, String model, int productionYear, String productionCountry, String color,
               double engineVolume, String transmission, String bodyType, String registrationNumber, int numberOfSeats,
               String aSignOfSummerOrWinterTires) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        this.color = color;
        this.engineVolume = engineVolume;
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.registrationNumber = registrationNumber;
        this.numberOfSeats = numberOfSeats;
    }
    public String getBrand() {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        return brand;
    }
    public String getModel() {
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        return model;
    }
    public int getProductionYear() {
        if (productionYear == 0){
            this.productionYear = 2020;
        }else {
            this.productionYear = productionYear;
        }
        return productionYear;
    }
    public String getProductionCountry() {
        if (productionCountry == null) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
        return productionCountry;
    }
    public String getColor() {
        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        return color;
    }
    public double getEngineVolume() {
        if (Double.compare(engineVolume, 0) == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        return engineVolume;
    }
    public String getTransmission() {
        if (transmission == null && transmission.isBlank() && transmission.isEmpty()) {
            this.transmission = "ручная";
        }else {
            this.transmission = transmission;
        }
        return transmission;
    }
    public String getBodyType() {
        if (bodyType == null && bodyType.isBlank() && bodyType.isEmpty()) {
            this.bodyType = "седан";
        }else {
            this.bodyType = bodyType;
        }
        return bodyType;
    }
    public String getRegistrationNumber() {
        if (registrationNumber == null && registrationNumber.isBlank() && registrationNumber.isEmpty()) {
            this.registrationNumber = "А177АА177";
        }else {
            this.registrationNumber = registrationNumber;
        }
        return registrationNumber;
    }
    public int getNumberOfSeats() {
        if (Double.compare(numberOfSeats, 0) <= 0) {
            this.numberOfSeats = 4;
        } else {
            this.numberOfSeats = numberOfSeats;
        }
        return numberOfSeats;
    }
    public String getaSignOfSummerOrWinterTires() {
        if (aSignOfSummerOrWinterTires != null && !aSignOfSummerOrWinterTires.isEmpty() && !aSignOfSummerOrWinterTires.isBlank()){
            this.aSignOfSummerOrWinterTires = aSignOfSummerOrWinterTires;
        }else {
            this.aSignOfSummerOrWinterTires = "летняя";
        }
        return aSignOfSummerOrWinterTires;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
    public void setASignOfSummerOrWinterTires(String aSignOfSummerOrWinterTires) {
        this.aSignOfSummerOrWinterTires = aSignOfSummerOrWinterTires;
    }

    public void outputMessage() {
        System.out.println("Марка автомобиля " + getBrand() + ", модель " + getModel() + ", год выпуска " + getProductionYear() +
        ", страна производитель " + getProductionCountry() + ", цвет " + getColor() + ", объем двигателя " + getEngineVolume()
        + ", коробка передач " + getTransmission() + ", тип кузова " + getBodyType() + ", регистрационный номер " +
        getRegistrationNumber() + ", количество мест " + getNumberOfSeats() + ", признак летняя или зимняя резина " +
                getaSignOfSummerOrWinterTires());
    }
    public void changeTiresForSeasonalOnes (String aSignOfSummerOrWinterTires){
        if (aSignOfSummerOrWinterTires == "летняя"){
            this.aSignOfSummerOrWinterTires = "зимняя";
        }else {
            this.aSignOfSummerOrWinterTires = "летняя";
        }
    }
    public static String checkingTheCorrectSpellingOfTheCarNumber (String registrationNumber){
        if (registrationNumber.length() != 7 && !registrationNumber.contains("х000хх000")){
            registrationNumber = "А177АА177";
        }else {
            registrationNumber = registrationNumber;
        }
        return registrationNumber;
    }

}
