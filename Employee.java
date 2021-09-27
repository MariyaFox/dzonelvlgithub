package ru.geekbrains.lesson5;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private int wages;
    private int age;

    /* Задания с 1го по 3е.

    public Employee(String _name, String _position,
                    String _email, String _phoneNumber, int _wages, int _age) {
        System.out.println("Первый сотрудник: " + _name + ", " + _position + ", "
                + _email + ", " + _phoneNumber + ", " + _wages + ", " + _age + ".");
    }
    public static void main (String [] args) {
        Employee employee1 = new Employee("Лев", "юрист",
                "lev@mail.ru", "+7999", 180000, 28);

        System.out.println();
    } */

    public Employee(String name, String position,
                    String email, String phoneNumber, int wages, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.wages = wages;
        this.age = age;


    }

    public static void main(String[] args) {
        Employee[] empArray = new Employee[5];

        empArray[0] = new Employee("Lev", "lawyer",
                "lev@mail.ru", "+7999123", 180000, 28);
        empArray[1] = new Employee("John", "accountant",
                "john@mail.ru", "+7988888", 200000, 45);
        empArray[2] = new Employee("Viktoria", "engineer",
                "vika@mail.ru", "+7988123", 205000, 35);
        empArray[3] = new Employee("Kris", "coder",
                "kris@mail.ru", "+7988333", 195000, 38);
        empArray[4] = new Employee("Luna", "personnel officer",
                "luna@mail.ru", "+7988111", 150000, 41);

        for (int i = 0; i < empArray.length; i++) {
            if (empArray[i].getAge() > 40) {
                empArray[i].printInfo();
            }
        }

    }
    public int getAge() {
        return age;
    }

    public void printInfo() {
        System.out.println("Сотрудники старше 40 лет: " + name + "," + age);
    }
}











