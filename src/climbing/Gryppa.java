package climbing;

public class Gryppa {
    private String name;
    private String country;
    private boolean isSet; //набор
    private double height; //высота


    // Конструктор
    public Gryppa(String name, String country, boolean isSet, double height) {
        this.name = name;
        this.country = country;
        this.isSet = isSet;
        this.height = height;
    }

    // методы для получения значений
    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public String getCountry() {
        return country;
    }

    void printName () {
        System.out.println("Название группы - " + name);
        System.out.println("Страна - " + country);
        System.out.println("Высота - " + height);

        if (isSet) {
            System.out.println("Идет набор!");
        } else {
            System.out.println("Набор закрыт!");
        }
    }
}
