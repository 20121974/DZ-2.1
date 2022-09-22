public class human {
    int yearOfBirth; //год рождения
    String name;
    String town; //город
    String job; //Должность

    void outputWelcomeMessage() {
        System.out.println("Привет! Меня зовут " + name + "." + " Я из города " + town + "." + " Мне " + yearOfBirth +
                " лет." + " Я работаю на должности " + job + "." + " Будем знакомы!");
    }

}
