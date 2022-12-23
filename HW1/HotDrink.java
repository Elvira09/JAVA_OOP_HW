package HWJavaOOP.HW1;

public class HotDrink extends Product {
    private float volume;
    private float temperature;

    public HotDrink(String nameProduct, float volume, float temperature, float priceProduct) {
        super(nameProduct, priceProduct);
        this.volume = volume;
        this.temperature = temperature;
    }

    public float getVolume() {
        return volume;
    }

    public float getTemperature() {
        return temperature;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + Float.floatToIntBits(volume);
        result = prime * result + Float.floatToIntBits(temperature);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        HotDrink other = (HotDrink) obj;
        if (Float.floatToIntBits(volume) != Float.floatToIntBits(other.volume))
            return false;
        if (Float.floatToIntBits(temperature) != Float.floatToIntBits(other.temperature))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Наименование: " + getNameProduct() +
                ", Объем: " + getVolume() +
                ", Температура: " + getTemperature() +
                ", Цена: " + getPriceProduct();
    }

}
