package task1;
import java.util.Random; // для исправления ошибки random

public class Scores3 {
    public static void main(String[] args) {
        Random random = new Random(); // для исправления ошибки random
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int score = random.nextInt(100) + 1;

        // Вывод количества набранных баллов
        System.out.println("Баллы за тест: " + score);

        // Определение оценки на основе количества баллов
        if (score >= 90 && score <= 100) {
            // Оценка "Отлично" для баллов от 90 до 100
            System.out.println("Оценка: Отлично");
        } else if (score >= 60 && score <= 89) {
            // Оценка "Хорошо" для баллов от 60 до 89
            System.out.println("Оценка: Хорошо");
        } else if (score >= 40 && score <= 59) {
            // Оценка "Удовлетворительно" для баллов от 40 до 59
            System.out.println("Оценка: Удовлетворительно");
        } else {
            // Оценка "Неудовлетворительно" для баллов меньше 40
            System.out.println("Оценка: Неудовлетворительно");
        }
    }
}
