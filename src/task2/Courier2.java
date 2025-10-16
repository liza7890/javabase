package task2;

public class Courier2 {
    public static void main(String[] args) {
        int floors = 10; // этажи
        int flats = 5; // квартиры на этаже

        System.out.println("курьер начинает доставку посылок");

        for (int floor = 1; floor <= floors; floor++) {
            //перебор всех квартир на текущем этаже
            for (int flat = 1; flat <= flats; flat++) {
                System.out.println("Этаж " + floor + ", Квартира " + flat + " - посылка доставлена");

            }
        }
        System.out.println("все посылки доставлены");



    }
}
