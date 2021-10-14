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
    public int getAge() {
        return age;
    }

    public void printInfo() {
        System.out.println("Сотрудники старше 40 лет: " + name + "," + age);
    }
}











