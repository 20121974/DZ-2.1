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
