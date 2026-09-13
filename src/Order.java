import java.util.Arrays;
import java.util.Objects;

public class Order {
    String customer;
    Product[] basket;

    public Order(String customer, Product[] basket) {
        this.customer = customer;
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "Покупатель " + customer + ", корзина " + Arrays.toString(basket);
    }

    @Override
    public boolean equals(Object ob) {
        if (this == ob) return true;
        if (ob == null || getClass() != ob.getClass()) return false;
        Order other = (Order) ob;
        if (Objects.equals(customer, other.customer)) return false;
        if (basket.length != other.basket.length) return false;
        for (int i = 0; i < basket.length; i++) {
            if (basket[i] == null) {
                if (other.basket[i] != null) return false;
            } else if (!basket[i].equals(other.basket[i])) {
                return false;
            }
        }
        return true;
    }
}
