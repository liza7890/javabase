package task2;

public class TrafficLight1 {
    public static void main(String[] args) {
        int colorCode = (int)(Math.random() * 3); // Генерирует 0, 1 или 2

        System.out.println("Код цвета: " + colorCode);

        switch (colorCode) {
            case 0: System.out.println("Красный цвет"); break;
            case 1: System.out.println("Зеленый цвет"); break;
            case 2: System.out.println("Желтый цвет"); break;
        }

    }
}
