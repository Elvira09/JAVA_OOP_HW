package HWJavaOOP.HW1;

public class Product {
    private String nameProduct;
    private float priceProduct;

    public Product(String nameProduct, float priceProduct) {
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public float getPriceProduct() {
        return priceProduct;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nameProduct == null) ? 0 : nameProduct.hashCode());
        result = prime * result + Float.floatToIntBits(priceProduct);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Product other = (Product) obj;
        if (nameProduct == null) {
            if (other.nameProduct != null)
                return false;
        } else if (!nameProduct.equals(other.nameProduct))
            return false;
        if (Float.floatToIntBits(priceProduct) != Float.floatToIntBits(other.priceProduct))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Наименование: " + getNameProduct() + ", Цена: " + getPriceProduct();
    }

}
