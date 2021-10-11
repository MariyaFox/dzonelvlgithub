public class EatCats {
    private static int TIME = 0;

    public static void main(String[] args) {

        Cat[] cat = new Cat[3];
        cat[0] = new Cat("Снежок", 150, 3);
        cat[1] = new Cat("Альфа", 100, 4);
        cat[2] = new Cat("Шанель", 30, 1);
        Plate plate = new Plate(700);
        System.out.println("Привет! У Вас есть три кота: " + cat[0].getName() + ", " + cat[1].getName() + " и " + cat[2].getName() + ", которые хотят есть каждые " + cat[0].getSatietyTime() + ", " + cat[1].getSatietyTime() + " и " + cat[2].getSatietyTime() + " час(а) соответственно.");
        System.out.println("Кто-то из них более прожорлив, кто-то менее. Сейчас в миске " + plate.getEat() + " грамм кошачьего корма. Посмотрим насколько его хватит, в данный момент коты очень голодны и направляются трапезничать.\n");

        do {
            for (Cat i : cat) {

                if (i.getSatiety() == 0) {

                    if (!plate.checkFood(i.getAppetite())) {
                        plate.increaseFood();
                    }

                    i.eat(plate);
                    System.out.println("Кот " + i.getName() + " съел " + i.getAppetite() + " граммов корма и проголодается через " + (i.getSatiety()) + " часа(ов)");
                }

                i.setSatiety(i.getSatiety() - 1);
            }
            System.out.println("\nС момента начала кормежки прошел(ло) " + TIME + " час(а). В миске осталось " + plate.getEat() + " граммов корма.\n");
            TIME++;

        } while (TIME <= 24);
    }

}
