package lesson5.HpmeWork5;

public class Personal {
    String name;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    public Personal(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return String.format("Сотрудник: %s. " +
                "Должность: %s. " +
                "Электронная почта сотрудника: %s. " +
                "Номер телефона: %s. " +
                "Зарплата сотрудника: %d. " +
                "Возраст сотрудника: %d. ", name, position, email, phone, salary, age);
    }
}
