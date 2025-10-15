package task1;

public class Month1 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in); // не работает без java.util. выдает иначе ошибку

        System.out.print("Введите номер месяца (от 1 до 12): ");

        // Чтение введенного числа
        int month = scanner.nextInt();

        scanner.close();

        // Проверка на корректность ввода
        if (month < 1 || month > 12) {
            System.out.println("Ошибка! Введите число от 1 до 12.");
        }
        else if (month == 12 || month == 1 || month == 2) {
            System.out.println("Зима");
        }
        else if (month >= 3 && month <= 5) {
            System.out.println("Весна");
        }
        else if (month >= 6 && month <= 8) {
            System.out.println("Лето");
        }
        else {
            System.out.println("Осень");
        }
    }
}
