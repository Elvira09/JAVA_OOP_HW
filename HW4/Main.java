package HWJavaOOP.HW4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import HWJavaOOP.HW4.IsGood.BeginsWith;
import HWJavaOOP.HW4.IsGood.BeginsWithA;
import HWJavaOOP.HW4.IsGood.IsEven;
import HWJavaOOP.HW4.IsGood.IsPositive;

public class Main {
    public static void main(String[] args) {
        List<String> ob1 = new ArrayList<>(Arrays.asList("Abb", "bbc", "CCd", "Abb", "dde"));
        List<Integer> ob2 = new ArrayList<>(Arrays.asList(23, -45, -26, 45, 78, 456, -2, 6, -9));

        Filter f1 = new Filter<String>(ob1);
        Filter f2 = new Filter<Integer>(ob2);

        System.out.println(f2.filter(f2, new IsEven())); 
        System.out.println(f2.filter(f2, new IsPositive())); 
        System.out.println(f1.filter(f1, new BeginsWithA())); 
        System.out.println(f1.filter(f1, new BeginsWith())); 
    }
}
