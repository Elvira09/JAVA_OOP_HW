package HWJavaOOP.HW4.IsGood;

public class IsEven<Integer> extends IsGood<Integer>{

    @Override
    public boolean isGood(Integer item) {
        return (int) item % 2 == 0;
    }

    
}
