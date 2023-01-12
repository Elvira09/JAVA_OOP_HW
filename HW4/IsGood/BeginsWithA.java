package HWJavaOOP.HW4.IsGood;

public class BeginsWithA <String> extends IsGood<String> {

    @Override
    public boolean isGood(String item) {
        return ((java.lang.String)item).charAt(0) == 'A';
    }
    
}
