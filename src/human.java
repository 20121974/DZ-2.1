public class human {
    private int yearOfBirth; //год рождения
    String name;
    private String town; //город
    String job; //Должность

    public human(String name, String town, int yearOfBirth, String job) {
        if (name != null){
            this.name = name;
        }else {
            this.name = "Информация не указана";
        }
        if (yearOfBirth < 0){
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }

        if (town != null){
            this.town = town;
        }else {
            this.town = "Информация не указана";
        }
        if (job != null){
            this.job = job;
        }else {
            this.job = "Информация не указана";
        }
    }

    void outputWelcomeMessage() {
        System.out.println("Привет! Меня зовут " + name + "." + " Я из города " + town + "." + " Мне " + yearOfBirth +
                " лет." + " Я работаю на должности " + job + "." + " Будем знакомы!");
    }

}
