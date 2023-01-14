package HWJavaOOP.HW4.IsGood;

public class IsPositive extends IsGood<Integer> {

    @Override
    public boolean isGood(Integer item) {
        return  item > 0;
    }

    
}
