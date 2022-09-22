public class Main {
    public static void main(String[] args) {
        human maxim = new human();
        maxim.name = "Максим";
        maxim.town = "Минска";
        maxim.yearOfBirth = 35;
        maxim.job = "бренд-менеджера";
        maxim.outputWelcomeMessage();

        human anya = new human();
        anya.name = "Аня";
        anya.town = "Москва";
        anya.yearOfBirth = 29;
        anya.job = "методиста образовательных программ";
        anya.outputWelcomeMessage();

        human katya = new human();
        katya.name = "Катя";
        katya.town = "Калининграда";
        katya.yearOfBirth = 28;
        katya.job = "продакт-менеджера";
        katya.outputWelcomeMessage();

        human artem = new human();
        artem.name = "Артем";
        artem.town = "Москва";
        artem.yearOfBirth = 27;
        artem.job = "директора по развитию бизнеса";
        artem.outputWelcomeMessage();


    }
}