package climbing;

public class Alpinist {
    private String name;
    private int age;
    private String address;



    // Конструктор
    public Alpinist(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;


    }

    // методы для получения значений
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }




    // вывод метода
    void printOnlyName() {
        System.out.println(name);


    }

    void printName () {
        System.out.println("Имя альпиниста - " + name);
        System.out.println("Возрост альпиниста - " + age);
        System.out.println("Адрес альпиниста - " + address);



    }





}
