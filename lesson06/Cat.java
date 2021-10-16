package ru.geekbrains.lesson06;

public class Cat extends Animal {

    public Cat(int runLength, int swimLength) {
        super(runLength, swimLength);
    }

    @Override
    void run(int length) {
        if ((length >= 0) && (length <= runLength)) System.out.println("run: true");
        else System.out.println("run: false");
    }

    @Override
    void swim(int length) {
        System.out.println("swim: false");
    }

}
