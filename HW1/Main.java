package HWJavaOOP.HW1;

import java.util.Arrays;

/*
При решении этих задач следуйте принципам абстракции, инкапсуляции, наследования, полиморфизма.
Создайте унаследованный класс ГорячийНапиток с дополнительным полем int температура.
Создайте класс АвтоматГорячихНапитков, реализующий интерфейс ТорговыйАвтомат и реализуйте перегруженный 
метод getProduct(int name, int volume, int temperature), выдающий продукт, соответствующий имени, объему и температуре.
В main проинициализируйте несколько ГорячихНапитков и АвтоматГорячихНапитков и позвольте покупателю купить товар.
 */
public class Main {
    public static void main(String[] args) {
        
        VendingMachine  machine = new VendingMachine (Arrays.asList(
            new HotDrink("Кофе Ристрето", 30, 88, 150),
            new HotDrink("Кофе Американо", 150, 90, 150),
            new HotDrink("Кофе Капучино", 200, 80, 200),
            new HotDrink("Чай зеленый", 250, 77, 120),
            new HotDrink("Чай облепиховый", 300, 90, 170)
            ));
        machine.showProduct();
        machine.buyProduct();
    }
}
