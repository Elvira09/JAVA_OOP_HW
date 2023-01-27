package HWJavaOOP.HW6.view;

import java.util.Scanner;

import HWJavaOOP.HW6.model.FaceId;
import HWJavaOOP.HW6.model.Fingerprint;
import HWJavaOOP.HW6.model.Pin;

public class View implements InterfeceVew{

    @Override
    public void getUnlockMethod() {
        System.out.println("Введите способ разблокировки телефона: ");
        System.out.println("\n 1. Войти с помощью пин-кода.");
        System.out.println("\n 2. Войти с помощью отпечатка пальца");    
        System.out.println("\n 3. Войти с помощью faceID.");
        System.out.println("\n 4. Войти без пароля");
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        Integer method = sc.nextInt();

        if(!(method instanceof Integer) || (method >4) || (method < 1 )){
            System.out.println("Ввод некорректен, попробуйте еще раз");
            method = sc.nextInt();
        }
        else {
            switch (method) {
                case 1: new Pin().unlockMethod();
                    break;
                case 2: new Fingerprint().unlockMethod();
                    break;
                case 3: new FaceId().unlockMethod();
                    break;
                case 4: System.out.println("Выполнен вход");
                    break;
            }
        } 
        sc.close();        
    }
    
}
