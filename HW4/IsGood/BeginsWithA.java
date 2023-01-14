package HWJavaOOP.HW4.IsGood;

public class BeginsWithA  extends IsGood<String> {

    @Override
    public boolean isGood(String item) {
        return item.charAt(0) == 'A';
    }
    
}
