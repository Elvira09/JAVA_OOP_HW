package HWJavaOOP.HW4.IsGood;

import java.util.Scanner;

public class BeginsWith extends IsGood<String>{
    // Scanner sc;
    @Override
    public boolean isGood(String item) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку для сравнения ");
        String text = (String) sc.nextLine();
        return  text.startsWith(item);
    }
    
}
