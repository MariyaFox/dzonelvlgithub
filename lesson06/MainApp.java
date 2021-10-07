package ru.geekbrains.lesson06;


public class MainApp {
    public static void main(String[] args) {
        Cat cat = new Cat(200, 0);
        cat.run(200);
        cat.swim(0);
        System.out.println("Кот пробежал 200 метров. \nКот не умеет плавать.");

        Dog dog = new Dog(500, 10);
        dog.run(500);
        dog.swim(10);
        System.out.println("Собака пробежала 500 метров.\nСобака проплыла 10 метров.");
    }
}
