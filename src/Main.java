import transport.Car;

public class Main {
    public static void main(String[] args) {

        human maxim = new human("Максим", "Минска", 35, "бренд-менеджера");
        maxim.outputWelcomeMessage();
        human anya = new human("Аня", "Москва", 29, "методиста образовательных программ");
        anya.outputWelcomeMessage();
        human katya = new human("Катя", "Калининграда", 28, "продакт-менеджера");
        katya.outputWelcomeMessage();
        human artem = new human("Артем", "Москва", 27, "директора по развитию бизнеса");
        artem.outputWelcomeMessage();
        human vladimir = new human("Владимир", "Казань", 21, "безработный");
        vladimir.outputWelcomeMessage();

        Car lada = new Car("Lada", "Grande", 2015, "Россия", "желтый", 1.7,
                "ручная", "седан", "Б177ББ177", 4, "летняя");
        lada.getInsurance(2, "8000 рублей", "111111111");
        lada.outputMessage();
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германия", "черный", 3.0,
                "автоматическая", "седан", "В178ВВ178", 5, "зимняя");
        audi.getInsurance(3, "10000 рублей", "111111112");
        audi.outputMessage();
        Car bmv = new Car("BMW", "Z8", 2021, "Германия", "черный", 3.0,
                "автоматическая", "хэчбек", "Е178ВВ178", 5, "летняя");
        bmv.getInsurance(2, "8000 рублей", "111111111");
        bmv.outputMessage();
        Car kia = new Car("Kia", "Sportage 4 поколение", 2018, "Южная Корея", "красный", 2.4,
                "ручная", "седан", "Д177ДД177", 4, "зимняя");
        kia.getInsurance(2, "8000 рублей", "111111111");
        kia.outputMessage();
        Car hyundai = new Car("Hyundai", "Avante", 2016, "Южная Корея", "оранжевый", 1.6,
                "ручная", "куппе", "Г177ГГ177", 8, "зимняя");
        hyundai.getInsurance(2, "8000 рублей", "111111111");
        hyundai.outputMessage();

        flower roza = new flower("Роза обыкновенная", null, "Голландия", 35.59, 0);
        roza.outputMessage();
        flower chrysanthemum = new flower("Хризантема", null, null, 15, 5);
        chrysanthemum.outputMessage();
        flower pion = new flower("Пион", null, "Англия", 69.9, 1);
        pion.outputMessage();
        flower gypsophila = new flower("Гипсофила", null, "Турция", 19.5, 10);
        gypsophila.outputMessage();


    }


}
