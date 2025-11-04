package task2;

public class Bmi3 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Вес (кг): ");
        double m = scanner.nextDouble();

        System.out.print("Рост (м): ");
        double h = scanner.nextDouble();

        // Расчет ИМТ
        double i = m / (h * h);

        // Вывод результата
        System.out.println("ИМТ: " + i);

        // Определение категории
        if (i < 16) System.out.println("Выраженный дефицит");
        else if (i < 18.5) System.out.println("Дефицит");
        else if (i < 25) System.out.println("Норма");
        else if (i < 30) System.out.println("Избыточный вес");
        else if (i < 35) System.out.println("Ожирение 1-й степени");
        else if (i < 40) System.out.println("Ожирение 2-й степени");
        else System.out.println("Ожирение 3-й степени");

        scanner.close();
    }
}
