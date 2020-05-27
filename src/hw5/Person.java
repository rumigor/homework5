package hw5;

public class Person {
    private String name;
    private String position;
    private String email;
    private String tel;
    private int salary;
    private int age;

    public Person(String name, String position, String email, String tel, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
    }

    public static void printInfo(Person [] person){
        System.out.printf("%-30s%-20s%-20s%-15s%-14s%-7s%n", "ФИО", "Должность", "E-mail", "Телефон", "Зарплата (руб)", "возраст");
        for (int i = 0; i < person.length; i++) {
            if (person[i].age > 40) {
                System.out.printf("%-30s%-20s%-20s%-15s%-14d%-7d%n", person[i].name, person[i].position, person[i].email,
                        person[i].tel, person[i].salary, person[i].age);
            }
        }

    }
}
