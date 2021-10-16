package ru.geekbrains.lesson06;

abstract class Animal {

    protected int runLength;
    protected int swimLength;

    abstract void run(int length);

    abstract void swim(int length);

    public Animal(int runLength, int swimLength) {
        this.runLength = runLength;
        this.swimLength = swimLength;
    }
}
