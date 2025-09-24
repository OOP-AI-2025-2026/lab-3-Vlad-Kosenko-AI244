package task_2;

public class Main {
    public static void main(String[] args) {
        Item bread = new Item(1, "Хліб", 40);
        Item milk = new Item(2, "Молоко", 70);
        Item butter = new Item(3, "Ковбаса", 120);

        Cart cart = new Cart(10); // масив на 10 елементів
        cart.addItem(bread);
        cart.addItem(milk);
        cart.addItem(butter);

        Order order = new Order(1001, "Влад К.", cart);
        order.printOrder();

        // Перевірка видалення
        cart.removeById(2);
        System.out.println("\nПісля видалення товару:");
        order.printOrder();
    }
}
