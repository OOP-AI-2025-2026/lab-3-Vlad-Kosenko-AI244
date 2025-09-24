package task_3;

public class IntStack {
    private int[] data;
    private int size;

    public IntStack() {
        this.data = new int[10]; // початковий розмір
        this.size = 0;
    }

    public void push(int value) {
        if (this.size == this.data.length) {
            expandCapacity();
        }
        this.data[this.size++] = value;
        System.out.println("Додано елемент: " + value);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Спроба витягнути елемент з порожнього стека!");
            return 0; // якщо стек порожній
        }
        int value = this.data[--this.size];
        System.out.println("Витягнуто елемент: " + value);
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Стек порожній, нічого переглядати!");
            return 0; // якщо стек порожній
        }
        int value = this.data[this.size - 1];
        System.out.println("Перегляд верхівки: " + value);
        return value;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void clear() {
        this.size = 0;
        System.out.println("Стек очищено!");
    }

    private void expandCapacity() {
        int[] newData = new int[this.data.length * 2];
        for (int i = 0; i < this.data.length; i++) {
            newData[i] = this.data[i];
        }
        this.data = newData;
        System.out.println("Розмір стека збільшено до " + this.data.length);
    }
}
