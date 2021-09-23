package ru.geekbrains.lesson3;

public class MassApp {


    public static void main(String[] args) {
        int[] mass = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < mass.length; i++) {
            mass[i] = (mass[i] - 1) * -1;
        }



        int [] array = new int[100];
        for (int i = 0, j = 1; i < array.length; i++, j++) {
            array[i] = j;
        }


        int [] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < array.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }


        int [][] mas = new int [4][4];

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++){
                if (j == i) {
                    mas[i][j] = 1;
                }
                if (j == mas.length - 1 - i) {
                        mas[i][j] = 1;
                    }
            }
        }
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {

                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }

        foo(4, 456);
    }
    public static int[] foo(int len,int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

}


