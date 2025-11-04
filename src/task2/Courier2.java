package task2;

public class Courier2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) { // i++ увеличивает число на 1
            if (i == 1) {
                for (int d = 1; d <= 5; d++) {
                    System.out.println("Этаж N" + i + " квартира N" + d);
                }
            } else {
                for (int d = 5 * i - 4; d <= 5 * i; d++) {
                    System.out.println("Этаж N" + i + " квартира N" + d);
                }
            }
        }



    }
}
