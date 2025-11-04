package task1;

import java.util.Scanner;


public class Coordinates5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод данных
        System.out.print("Начальная скорость (м/с): ");
        double v = scanner.nextDouble();

        System.out.print("Угол (градусы): ");
        double angle = scanner.nextDouble();

        // Перевод в радианы
        double rad = Math.toRadians(angle);
        double g = 9.8;

        // Время полета
        double totalTime = (2 * v * Math.sin(rad)) / g;
        System.out.println("Время полета: " + totalTime + " с");

        // Ввод времени для расчета
        System.out.print("Введите время (с): ");
        double t = scanner.nextDouble();

        if (t <= totalTime) {
            // Расчет координат
            double x = v * Math.cos(rad) * t;
            double y = v * Math.sin(rad) * t - (g * t * t) / 2;

            System.out.println("X = " + x + " м");
            System.out.println("Y = " + y + " м");
        } else {
            System.out.println("Тело уже упало!");
        }

        scanner.close();
    }
}

