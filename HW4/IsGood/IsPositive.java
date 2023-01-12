package HWJavaOOP.HW4.IsGood;

public class IsPositive<Integer> extends IsGood<Integer> {

    @Override
    public boolean isGood(Integer item) {
        return (int) item > 0;
    }

    
}
