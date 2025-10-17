package task1;

public class Cast4 {
    public static void main(String[] args) {
        System.out.println("РАСЧЕТ ВЫСОТЫ ПОДЪЕМА ТЕЛА");

        //1: Прямая инициализация константами
        System.out.println("1: Прямая инициализация");
        double velocity1 = 25.0; // м/с
        double time1 = 3.0; // с
        double gravity1 = 9.81; // м/с²
        calculateHeight(velocity1, time1, gravity1);

        // 2: Инициализация через математические выражения
        System.out.println("2: Математические выражения");
        double velocity2 = 10.0 * 2.5;
        double time2 = 6.0 / 2.0;
        double gravity2 = 9.8 + 0.01;
        calculateHeight(velocity2, time2, gravity2);

        //3: Инициализация через вызов методов
        System.out.println("3: Через методы");
        double velocity3 = getVelocity();
        double time3 = getTime();
        double gravity3 = getGravity();
        calculateHeight(velocity3, time3, gravity3);

        // 4: Инициализация через ввод пользователя
        System.out.println("4: Ввод от пользователя");
        initializeFromUserInput();


    }

    // Метод для расчета и вывода высоты
    public static void calculateHeight(double velocity, double time, double gravity) {
        // Формула: h = v0 * t - (g * t²) / 2
        double height = velocity * time - (gravity * time * time) / 2;

        System.out.printf("Скорость: %.1f м/с, Время: %.1f с, Ускорение: %.2f м/с²%n",
                velocity, time, gravity);
        System.out.printf("Высота тела: %.2f метров%n", height);

        // Дополнительная информация о состоянии тела
        if (height > 0) {
            System.out.println("Состояние: Тело находится в воздухе");
        } else {
            System.out.println("Состояние: Тело упало на землю");
        }
    }

    // Методы для инициализации через вызовы
    public static double getVelocity() {
        return 15.0 + 10.0;  // м/с
    }

    public static double getTime() {
        return 4.0 - 1.0;    // с
    }

    public static double getGravity() {
        return 9.81;         // м/с²
    }

    // Метод для инициализации через пользовательский ввод
    public static void initializeFromUserInput() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);


        System.out.print("Введите начальную скорость (м/с): ");
        double userVelocity = scanner.nextDouble();

        System.out.print("Введите время полета (с): ");
        double userTime = scanner.nextDouble();

        System.out.print("Введите ускорение свободного падения (м/с²): ");
        double userGravity = scanner.nextDouble();

        calculateHeight(userVelocity, userTime, userGravity);

        scanner.close();
    }

    // Вложенный класс с константами
    static class Constants {
        public static final double INITIAL_VELOCITY = 30.0;  // м/с
        public static final double FLIGHT_TIME = 2.5;        // с
        public static final double GRAVITY = 9.81;           // м/с²
    }
}

