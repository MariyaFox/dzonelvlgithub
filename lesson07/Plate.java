public class Plate {
    private int eat;

    int getEat() {
        return eat;
    }

    Plate(int eat) {
        this.eat = eat;
    }

    void decreaseFood(int n) {
        eat -= n;
    }

    void increaseFood() {
        this.eat += 400;
        System.out.println("В миску добавили 400 грамм корма");
    }

    boolean checkFood(int n) {
        return (eat - n) >= 0;
    }
}
