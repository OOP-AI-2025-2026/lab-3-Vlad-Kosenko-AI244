package task_2;

public class Order {
    private int id;
    private String customer;
    private Cart cart;

    public Order(int id, String customer, Cart cart) {
        this.id = id;
        this.customer = customer;
        this.cart = cart;
    }

    public void printOrder() {
        System.out.println("Номер замовлення: " + this.id);
        System.out.println("Клієнт: " + this.customer);
        System.out.println("Товари:");
        for (Item i : this.cart.getItems()) {
            System.out.println(" - " + i);
        }
        System.out.println("Ціна: " + this.cart.getTotalPrice() + " ГРН");
    }
}

