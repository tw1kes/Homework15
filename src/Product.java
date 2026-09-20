import java.util.Objects;

public class Product {
    int id;
    String name;
    int price;
    String category;

    public Product(int id, String name, int price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }
    @Override
    public String toString() {
        return "Товар: артикул " + this.id + " название " + this.name + " цена " + this.price + " категория " + this.category;
    }
    @Override
    public boolean equals(Object ob) {
        if (this == ob) return true;
        if (ob == null || getClass() != ob.getClass()) {
            return false;
        }
        Product product = (Product) ob;
        return id == product.id && Objects.equals(category, product.category);
    }
}
