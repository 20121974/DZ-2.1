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


    }
}