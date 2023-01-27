package HWJavaOOP.HW6.model;

import java.util.Scanner;

public class Pin extends Unlocker{

    @Override
    public void unlockMethod() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 4-значное число");
        Integer pin = sc.nextInt();

        if(!(pin instanceof Integer) || (Integer.toString(pin).length() != 4)){
            System.out.println("Ввод некорректен, попробуйте еще раз");
            unlockMethod();
        }
        else {
            System.out.println("Выполнен вход по пин-коду");

        }       
        sc.close();    
    }
    
}
