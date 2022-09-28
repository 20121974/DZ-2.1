@SuppressWarnings("ALL")
public class human {
    private int yearOfBirth; //год рождения
    String name;
    private String town; //город
    String job; //Должность

    @SuppressWarnings("ReplaceNullCheck")
    public human(String name, String town, int yearOfBirth, String job) {
        if (name == null) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (job == null) {
            this.job = "Информация не указана";
        } else {
            this.job = job;
        }
        this.town = town;
        this.yearOfBirth = yearOfBirth;
    }

    @SuppressWarnings("unused")
    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town != null && !town.isEmpty() && !town.isBlank()) {
            this.town = town;
        } else {
            this.town = "Информация не указана";
        }
    }

    void outputWelcomeMessage () {
        System.out.println("Привет! Меня зовут " + name + "." + " Я из города " + town + "." + " Мне " + yearOfBirth +
                    " лет." + " Я работаю на должности " + job + "." + " Будем знакомы!");
    }

}
