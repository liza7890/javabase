package task1;

public class Cast4 {
    public static void main(String[] args) {

        // Способ 1: Фиксированные значения
        double v1 = 25.0; // скорость
        double t1 = 3.0; // время
        double g1 = 9.8; // ускорение
        double h1 = v1 * t1 - (g1 * t1 * t1) / 2;
        System.out.println("Способ 1 - Высота: " + h1 + " м");

        // Способ 2: Ввод от пользователя
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Введите скорость (м/с): ");
        double v2 = scanner.nextDouble();

        System.out.print("Введите время (с): ");
        double t2 = scanner.nextDouble();
        double h2 = v2 * t2 - (9.8 * t2 * t2) / 2;
        System.out.println("Способ 2 - Высота: " + h2 + " м");

        // Способ 3: Через метод
        double h3 = calculateHeight(30.0, 2.5);
        System.out.println("Способ 3 - Высота: " + h3 + " м");
    }

    public static double calculateHeight(double velocity, double time) {
        double gravity = 9.8;
        return velocity * time - (gravity * time * time) / 2;
    }





}




