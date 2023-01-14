package HWJavaOOP.HW4.IsGood;

public class IsEven extends IsGood<Integer>{

    @Override
    public boolean isGood(Integer item) {
        return item % 2 == 0;
    }

    
}
