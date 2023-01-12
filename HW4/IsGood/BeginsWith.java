package HWJavaOOP.HW4.IsGood;

import java.util.Scanner;

public class BeginsWith<String> extends IsGood<String>{
    @Override
    public boolean isGood(String item) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку для сравнения ");
        String text = (String) sc.nextLine();
        // sc.close();
        return  ((java.lang.String) text).startsWith((java.lang.String) item);
    }
    
}
