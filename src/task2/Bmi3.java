package task2;

public class Bmi3 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Введите массу тела в килограммах: ");
        double weight = scanner.nextDouble();

        System.out.print("Введите рост в метрах: ");
        double height = scanner.nextDouble();

        scanner.close();

        if (weight <= 0 || height <= 0) {
            System.out.println("Ошибка! Вес и рост должны быть положительными числами.");
            return;
            }

        // Расчет индекса массы тела по формуле: I = m / h²
        double bmi = weight / (height * height);

        // Вывод рассчитанного ИМТ с округлением до двух знаков после запятой
        System.out.printf("Ваш индекс массы тела: %.2f%n", bmi);

        if (bmi < 16) {
            System.out.println("Результат: Выраженный дефицит массы тела");
        } else if (bmi >= 16 && bmi < 18.5) {
            System.out.println("Результат: Дефицит массы тела");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Результат: Норма");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Результат: Избыточная масса тела (предожирение)");
        } else if (bmi >= 30 && bmi < 35) {
            System.out.println("Результат: Ожирение 1-й степени");
        } else if (bmi >= 35 && bmi < 40) {
            System.out.println("Результат: Ожирение 2-й степени");
        } else {
            System.out.println("Результат: Ожирение 3-й степени");
        }
    }
}
