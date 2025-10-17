package task2;

public class Test5 {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Переменная для подсчета правильных ответов
        int score = 0;

        System.out.println("ВИКТОРИНА НА 10 ВОПРОСОВ");
        System.out.println("Выберите номер правильного ответа (1, 2 или 3)");

        // Вопрос 1
        System.out.println("1. Какая планета самая большая в Солнечной системе?");
        System.out.println("1) Земля");
        System.out.println("2) Юпитер");
        System.out.println("3) Сатурн");
        System.out.print("Ваш ответ: ");
        int answer1 = scanner.nextInt();
        if (answer1 == 2) {
            score++;
            System.out.println("Правильно!");
        } else {
            System.out.println("Неправильно. Правильный ответ: Юпитер");
        }

        System.out.println("2. Какой язык программирования самый популярный в 2024 году?");
        System.out.println("1) Java");
        System.out.println("2) Python");
        System.out.println("3) JavaScript");
        System.out.print("Ваш ответ: ");
        int answer2 = scanner.nextInt();
        if (answer2 == 2) {
            score++;
            System.out.println(" Правильно!");
        } else {
            System.out.println("Неправильно. Правильный ответ: Python");
        }

        System.out.println("3. Сколько континентов на Земле?");
        System.out.println("1) 5");
        System.out.println("2) 6");
        System.out.println("3) 7");
        System.out.print("Ваш ответ: ");
        int answer3 = scanner.nextInt();
        if (answer3 == 3) {
            score++;
            System.out.println("Правильно!");
        } else {
            System.out.println("Неправильно. Правильный ответ: 7");
        }

        System.out.println("4. Какая столица Японии?");
        System.out.println("1) Пекин");
        System.out.println("2) Сеул");
        System.out.println("3) Токио");
        System.out.print("Ваш ответ: ");
        int answer4 = scanner.nextInt();
        if (answer4 == 3) {
            score++;
            System.out.println("Правильно!");
        } else {
            System.out.println("Неправильно. Правильный ответ: Токио");
        }

        System.out.println("5. Кто написал роман 'Война и мир'?");
        System.out.println("1) Фёдор Достоевский");
        System.out.println("2) Лев Толстой");
        System.out.println("3) Антон Чехов");
        System.out.print("Ваш ответ: ");
        int answer5 = scanner.nextInt();
        if (answer5 == 2) {
            score++;
            System.out.println("Правильно!");
        } else {
            System.out.println("Неправильно. Правильный ответ: Лев Толстой");
        }

        System.out.println("6. Какое химическое обозначение у золота?");
        System.out.println("1) Ag");
        System.out.println("2) Au");
        System.out.println("3) Fe");
        System.out.print("Ваш ответ: ");
        int answer6 = scanner.nextInt();
        if (answer6 == 2) {
            score++;
            System.out.println("Правильно!");
        } else {
            System.out.println("Неправильно. Правильный ответ: Au");
        }

        System.out.println("7. В каком году человек впервые полетел в космос?");
        System.out.println("1) 1957");
        System.out.println("2) 1961");
        System.out.println("3) 1969");
        System.out.print("Ваш ответ: ");
        int answer7 = scanner.nextInt();
        if (answer7 == 2) {
            score++;
            System.out.println("Правильно!");
        } else {
            System.out.println("Неправильно. Правильный ответ: 1961");
        }

        System.out.println("8. Какая самая длинная река в мире?");
        System.out.println("1) Амазонка");
        System.out.println("2) Нил");
        System.out.println("3) Янцзы");
        System.out.print("Ваш ответ: ");
        int answer8 = scanner.nextInt();
        if (answer8 == 2) {
            score++;
            System.out.println("Правильно!");
        } else {
            System.out.println("Неправильно. Правильный ответ: Нил");
        }

        System.out.println("9. Сколько бит в одном байте?");
        System.out.println("1) 8");
        System.out.println("2) 16");
        System.out.println("3) 32");
        System.out.print("Ваш ответ: ");
        int answer9 = scanner.nextInt();
        if (answer9 == 1) {
            score++;
            System.out.println("Правильно!");
        } else {
            System.out.println("Неправильно. Правильный ответ: 8");
        }

        System.out.println("10. Кто открыл Америку?");
        System.out.println("1) Васко да Гама");
        System.out.println("2) Христофор Колумб");
        System.out.println("3) Фернан Магеллан");
        System.out.print("Ваш ответ: ");
        int answer10 = scanner.nextInt();
        if (answer10 == 2) {
            score++;
            System.out.println("Правильно!");
        } else {
            System.out.println("Неправильно. Правильный ответ: Христофор Колумб");
        }

        scanner.close();

        System.out.println("РЕЗУЛЬТАТЫ ВИКТОРИНЫ");
        System.out.println("Правильных ответов: " + score + " из 10");

        if (score >= 9) {
            System.out.println("Отлично! Вы умны!");
        } else if (score >= 7) {
            System.out.println("Хорошо! Отличные знания!");
        } else if (score >= 5) {
            System.out.println("Неплохо! Есть куда стремиться!");
        } else {
            System.out.println("Стоит подтянуть знания!");
        }
    }
}


