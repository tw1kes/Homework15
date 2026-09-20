public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(11111111, "Карандаш", 100, "Канцелярия");
        Product product2 = new Product(22222222, "Шариковая ручка", 200, "Канцелярия");
        System.out.println(product1);
        System.out.println(product2);

        System.out.println(product1.equals(product2));

        Order order1 = new Order("Евгения", new Product[]{product1, product2});
        Order order2 = new Order("Александр", new Product[]{product1, product1});

        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order1.equals(order2));

    }
}