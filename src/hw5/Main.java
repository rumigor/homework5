package hw5;

public class Main {

    public static void main(String[] args) {
	    Person [] workers = new Person [] {
            new Person("Иванов Иван Иванович", "директор", "ivanov@abc.com", "+79990001122",1000, 55),
            new Person("Сидоров Петр Сергеевич", "главный инженер", "sidorov@abc.com", "+79995553344", 750, 50),
            new Person("Пирожков Артур Сергеевич", "менеджер", "pirozhkov@abc.com", "+79895554412", 400, 33),
            new Person("Румянцев Игорь Александрович", "главный специалист", "ir@abc.com", "+79997776655", 600, 32),
            new Person("Старожилов Петр Владимирович", "уборщик", "starozhilov@abc.com", "+79998883355", 250, 46)
        };
        Person.printInfo(workers);
    }
}
