package task2;

public class Income4 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Введите доход (SEK): ");
        double income = scanner.nextDouble();
        double tax = 0;

        if (income <= 18800) {
            tax = income * 0.11;
        } else if (income <= 468700) {
            tax = (income - 18800) * 0.20;
        } else if (income <= 675700) {
            tax = (income - 468700) * 0.32;
        } else {
            tax = (income - 675700) * 0.40;
        }

        double net = income - tax; // Чистый доход = Общий доход - Налог

        System.out.printf("Налог: %.0f SEK%n", tax);
        System.out.printf("Чистый доход: %.0f SEK%n", net);

        scanner.close();
    }
}
