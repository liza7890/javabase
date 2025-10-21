package task2;

import java.util.Scanner;

public class Washing7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество тарелок: ");
        int plates = scanner.nextInt();

        System.out.print("Введите количество моющего средства: ");
        double detergent = scanner.nextDouble();

        scanner.close();

        if (plates <= 0 || detergent <= 0) {
            System.out.println("Ошибка: Количество тарелок и средства должно быть положительным!");
            return;
        }


        System.out.println("\nПРОЦЕСС МОЙКИ ТАРЕЛОК ");
        System.out.printf("Исходное количество средства: %.1f%n", detergent);
        System.out.println("Расход на одну тарелку: 0.5");


        // Процесс мойки тарелок
        for (int i = 1; i <= plates; i++) {
            // хватает ли средства для мойки текущей тарелки
            if (detergent >= 0.5) {
                // Расход средства на одну тарелку
                detergent -= 0.5;
                // информация о помытой тарелке и остатке средства
                System.out.printf("Помыта тарелка №%d. Осталось средства: %.1f%n", i, detergent);
            } else {
                System.out.printf("Не хватает средства для тарелки №%d%n", i);
                System.out.printf("Осталось средства: %.1f%n", detergent);
                break;
            }
        }

        if (detergent > 0) {
            System.out.printf("Все тарелки помыты! Остаток средства: %.1f%n", detergent);
        } else {
            System.out.println("Средство закончилось! Не все тарелки помыты.");
        }
    }
}
