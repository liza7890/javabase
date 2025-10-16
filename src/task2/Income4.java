package task2;

public class Income4 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Введите доход за месяц (SEK): ");
        double income = scanner.nextDouble();

        scanner.close();

        if (income < 0) {
            System.out.println("Ошибка: Доход не может быть отрицательным!");
            return;
        }

        // Расчет налога по прогрессивной шкале
        double tax = calculateTax(income);

        // Расчет чистого дохода после вычета налога
        double netIncome = income - tax;

        // Вывод результатов
        System.out.println("РАСЧЕТ НАЛОГА В ШВЕЦИИ");
        System.out.printf("Общий доход: %.2f SEK%n", income);
        System.out.printf("Сумма налога: %.2f SEK%n", tax);
        System.out.printf("Чистый доход: %.2f SEK%n", netIncome);
        System.out.printf("Эффективная ставка налога: %.1f%%%n", (tax / income) * 100);
    }

    public static double calculateTax(double income) {
        double tax = 0;

        if (income > 18800) {
            tax += 18800 * 0.11;
        } else {
            return income * 0.11;
        }

        if (income > 468700) {
            tax += (468700 - 18800) * 0.20;
        } else {
            tax += (income - 18800) * 0.20;
            return tax;
        }

        if (income > 675700) {
            tax += (675700 - 468700) * 0.32;
        } else {
            tax += (income - 468700) * 0.32;
            return tax;
        }

        tax += (income - 675700) * 0.40;
        return tax;
    }
}
