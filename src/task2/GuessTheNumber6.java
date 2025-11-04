package task2;

import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1; // nextInt(100) - метод, который возвращает случайное число от 0 до 99, а +1 увеличивает диапозон до 100

        int attempts = 3;

        System.out.println("ИГРА 'УГАДАЙ ЧИСЛО'");
        System.out.println("Я загадал число от 1 до 100.");
        System.out.println("У тебя " + attempts + " попытки чтобы угадать!");


        for (int attempt = 1; attempt <= attempts; attempt++) {
            System.out.printf("Попытка %d из %d. Введи число: ", attempt, attempts);

            if (!scanner.hasNextInt()) { // hasNextInt() - функция, который проверяет: тру и фолс :))
                System.out.println("Ошибка! Введи целое число.");
                scanner.next(); // Очистка неправильного ввода
                attempt--; // Не засчитываем эту попытку
                continue;
            }

            int userGuess = scanner.nextInt();


            if (userGuess < 1 || userGuess > 100) {
                System.out.println("Число должно быть от 1 до 100!");
                attempt--; // Не засчитываем эту попытку
                continue;
            }


            if (userGuess == secretNumber) {
                System.out.println("ПОЗДРАВЛЯЮ! Ты угадал число!");
                System.out.println("Это действительно " + secretNumber + "!");
                scanner.close();
                return; // Завершаем игру
            }

            else if (userGuess < secretNumber) {
                System.out.println("Не угадал! Загаданное число БОЛЬШЕ.");
            }
            else {
                System.out.println("Не угадал! Загаданное число МЕНЬШЕ.");
            }

            // Вывод оставшихся попыток (кроме последней)
            if (attempt < attempts) {
                System.out.printf("Осталось попыток: %d\n", attempts - attempt);
            }
        }


        System.out.println("\n ИГРА ОКОНЧЕНА!");
        System.out.println("Загаданное число было: " + secretNumber);
        System.out.println("Попробуй еще раз!");

        scanner.close();



    }
}
