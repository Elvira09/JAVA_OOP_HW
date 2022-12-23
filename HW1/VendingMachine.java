package HWJavaOOP.HW1;

import java.util.List;
import java.util.Scanner;



public class VendingMachine {
    private List<Product> products;
    private Scanner sc = new Scanner(System.in);

    public VendingMachine(List<Product> products) {
        this.products = products;
    }
    
    /**
     * показать товары
     */
    public void showProduct() {
        for (Product product : products) {
            System.out.println(product);   
        }
    }

    /**
     * @return Product product
     * Выбрать товар
     */
    private Product getProduct() {
        System.out.println("Введите наименование: ");
        String name = sc.nextLine();
        System.out.println("Введите объем напитка: ");
        float volume = sc.nextFloat();
        System.out.println("Введите температуру напитка: ");
        float temperature = sc.nextFloat();
        for (Product product : products) {
            if (!(product instanceof HotDrink))
                continue;
            HotDrink hotDrink = (HotDrink) product;
            if (product.getNameProduct().toLowerCase().contains(name) && hotDrink.getTemperature() == temperature
                    && hotDrink.getVolume() == volume)
                return product;
        }
        throw new IllegalStateException("Товар не найден!");
        // return null;
    }

    /**
     * Купить товар
     */
    public void buyProduct() {
        Product selectedProduct = getProduct();
        System.out.println("Внесите оплату: ");
        float deposit = 0f;
        while (true) {
            int cash = sc.nextInt();
            deposit += cash;
            if (deposit < selectedProduct.getPriceProduct()) {
                System.out.printf("Доплатите еще %f\n", selectedProduct.getPriceProduct() - deposit);
            } else if (deposit > selectedProduct.getPriceProduct()) {
                System.out.printf("Ваша сдача %f\n", deposit - selectedProduct.getPriceProduct());
                System.out.println("Возьмите Ваш товар.");
                break;
            } else {
                System.out.println("Возьмите Ваш товар");
                break;
            }
        }
        System.out.println("Спасибо за покупку!!!");
    }
   
}

