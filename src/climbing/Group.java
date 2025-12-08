package climbing;

public class Group {
    // Поля класса
    private String name;
    private String country;
    private int height; // высота в метрах

    // Конструктор
    public Group(String name, String country, int height) {
        this.name = name;
        this.country = country;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getHeight() {
        return height;
    }

    void printOnlyName() {
        System.out.println(name);
    }

    void printName () {
        System.out.println("Название горы - " + name);
        System.out.println("Страна горы - " + country);
        System.out.println("Высота горы - " + height);

    }



}
