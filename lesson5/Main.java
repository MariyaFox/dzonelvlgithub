package ru.geekbrains.lesson5;

import jdk.nashorn.internal.objects.annotations.Getter;


public class Main {

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
            if (empArray[i].getAge()> 40) {
                empArray[i].printInfo();
            }
        }

    }

}
