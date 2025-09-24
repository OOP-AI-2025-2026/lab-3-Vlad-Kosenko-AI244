package task_2;

public class Cart {
    private Item[] items;
    private int size;

    public Cart(int capacity) {
        this.items = new Item[capacity];
        this.size = 0;
    }

    public void addItem(Item item) {
        if (this.size < this.items.length) {
            this.items[this.size] = item;
            this.size++;
        } else {
            System.out.println("Корзина повна!");
        }
    }

    public void removeById(int id) {
        for (int i = 0; i < this.size; i++) {
            if (this.items[i].getId() == id) {
                for (int j = i; j < this.size - 1; j++) {
                    this.items[j] = this.items[j + 1];
                }
                this.items[this.size - 1] = null;
                this.size--;
                break;
            }
        }
    }

    public double getTotalPrice() {
        double sum = 0;
        for (int i = 0; i < this.size; i++) {
            sum += this.items[i].getPrice();
        }
        return sum;
    }

    public Item[] getItems() {
        Item[] result = new Item[this.size];
        for (int i = 0; i < this.size; i++) {
            result[i] = this.items[i];
        }
        return result;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }
}