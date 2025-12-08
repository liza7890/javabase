package climbing;

public class Application {
    public static void main(String[] args) {


    /* создание объекта
       ТипДанных название = new ТипДанных();
        */
        Alpinist petya = new Alpinist("Петр", 22, "Киров");
        Alpinist vasya = new Alpinist("Вася", 18, "Москва");
        Alpinist vasilisa = new Alpinist("Василиса", 20, "Питер");


        // вызов метода через точку
        petya.printName();
        vasya.printName();
        vasilisa.printName();


        Group everest = new Group("Эверест", "Китай", 8848);
        Group elbrus = new Group("Эльбрус", "Россия", 5642);
        Group kilimanjaro = new Group("Килиманджаро", "Танзания", 5895);


        everest.printOnlyName();
        elbrus.printOnlyName();
        kilimanjaro.printOnlyName();


        Gryppa group1 = new Gryppa("група 1","Китай", false, 8848 );
        Gryppa group2 = new Gryppa("група 2","Россия", true, 5642 );
        Gryppa group3 = new Gryppa("група 3","Танзания", true, 5895 );


        group1.printName();
        group2.printName();
        group3.printName();













    }

}

