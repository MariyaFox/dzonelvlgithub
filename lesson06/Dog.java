package ru.geekbrains.lesson06;

public class Dog extends Animal {
    public Dog(int runLength, int swimLength) {
        super(runLength, swimLength);
    }

    @Override
    void run(int length) {
        if ((length >= 0) && (length <= runLength)) System.out.println("run: true");
    }

    @Override
    void swim(int length) {
        if ((length >= 0) && (length <= swimLength)) System.out.println("swim: true");
        else System.out.println("swim: false");
    }
}
