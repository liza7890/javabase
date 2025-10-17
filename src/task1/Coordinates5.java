package task1;

import java.util.Scanner;


public class Coordinates5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("РАСЧЕТ ДВИЖЕНИЯ ТЕЛА, БРОШЕННОГО ПОД УГЛОМ К ГОРИЗОНТУ");

        System.out.print("Введите начальную скорость (м/с): ");
        double initialVelocity = scanner.nextDouble();

        System.out.print("Введите угол броска к горизонту (градусы): ");
        double angleDegrees = scanner.nextDouble();

        // Константа - ускорение свободного падения
        final double GRAVITY = 9.8;

        // Перевод угла из градусов в радианы
        double angleRadians = Math.toRadians(angleDegrees);

        // Разложение скорости на компоненты
        double velocityX = initialVelocity * Math.cos(angleRadians); // Горизонтальная
        double velocityY = initialVelocity * Math.sin(angleRadians); // Вертикальная

        // Расчет времени полета (t = (2 * v₀ * sinα) / g)
        double flightTime = (2 * initialVelocity * Math.sin(angleRadians)) / GRAVITY;

        System.out.printf(" РАСЧЕТНЫЕ ПАРАМЕТРЫ ");
        System.out.printf("\n Начальная скорость: %.2f м/с", initialVelocity);
        System.out.printf("\n Угол броска: %.2f°", angleDegrees);
        System.out.printf("\n Горизонтальная скорость: %.2f м/с", velocityX);
        System.out.printf("\n Вертикальная скорость: %.2f м/с", velocityY);
        System.out.printf("\n Время полета: %.2f секунд", flightTime);

        // Расчет максимальной высоты и дальности полета
        double maxHeight = (initialVelocity * initialVelocity * Math.sin(angleRadians) * Math.sin(angleRadians)) / (2 * GRAVITY);
        double maxRange = (initialVelocity * initialVelocity * Math.sin(2 * angleRadians)) / GRAVITY;

        System.out.printf("\n Максимальная высота: %.2f метров", maxHeight);
        System.out.printf("\n Дальность полета: %.2f метров", maxRange);

        // Запрос времени для расчета координат
        System.out.printf("\n Введите момент времени (не более %.2f секунд): ", flightTime);
        double time = scanner.nextDouble();





        if (time < 0) {
            System.out.println("Ошибка: Время не может быть отрицательным!");
        } else if (time > flightTime) {
            System.out.println("Ошибка: Введенное время превышает время полета тела!");
        } else {
            // Расчет координат в заданный момент времени
            // x = v₀ * cosα * t
            // y = v₀ * sinα * t - (g * t²) / 2
            double x = velocityX * time;
            double y = velocityY * time - (GRAVITY * time * time) / 2;

            System.out.printf("КООРДИНАТЫ ТЕЛА В МОМЕНТ ВРЕМЕНИ t = %.2f с ", time);
            System.out.printf("\n Координата X (дальность): %.2f метров", x);
            System.out.printf("\n Координата Y (высота): %.2f метров", y);




            if (y > 0) {
                System.out.println("\n Состояние: Тело находится в воздухе");
            } else {
                System.out.println("\n Состояние: Тело достигло земли");
            }
        }

        scanner.close();
    }
}

