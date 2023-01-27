package HWJavaOOP.HW6.model;

public class Fingerprint extends Unlocker {

    @Override
    public void unlockMethod() {
        System.out.println("Выполнен вход по отпечатку пальца");
    }

}
