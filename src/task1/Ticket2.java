package task1;

public class Ticket2 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Введите возраст посетителя: ");

        int age = scanner.nextInt();
        scanner.close();

        // Проверка на корректность введенного возраста
        if (age < 0 || age > 120) {
            System.out.println("Ошибка! Введите корректный возраст (от 0 до 120 лет).");
        } else {
            // Определение категории билета на основе возраста
            if (age < 7) {
                System.out.println("Категория билета: Детский");
            } else if (age >= 7 && age <= 17) {
                System.out.println("Категория билета: Подросток");
            } else if (age >= 18 && age <= 60) {
                System.out.println("Категория билета: Взрослый");
            } else {
                System.out.println("Категория билета: Пенсионный");
            }
        }
    }
}
