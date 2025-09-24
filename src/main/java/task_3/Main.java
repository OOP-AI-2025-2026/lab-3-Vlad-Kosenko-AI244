package task_3;

public class Main {
    public static void main(String[] args) {
        IntStack stack = new IntStack();

        // перевірка isEmpty()
        System.out.println("Стек порожній? " + stack.isEmpty()); // true

        // додавання елементів
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // перевірка size() та peek()
        System.out.println("Кількість елементів: " + stack.size());   // 3
        System.out.println("Верхівка стека: " + stack.peek());        // 30

        // перевірка pop()
        System.out.println("Витягнули елемент: " + stack.pop());      // 30
        System.out.println("Витягнули елемент: " + stack.pop());      // 20
        System.out.println("Витягнули елемент: " + stack.pop());      // 10

        // pop() з порожнього стеку
        System.out.println("Витяг з порожнього стека: " + stack.pop()); // 0

        // перевірка isEmpty()
        System.out.println("Стек порожній зараз? " + stack.isEmpty()); // true

        // ще кілька елементів
        stack.push(100);
        stack.push(200);
        stack.push(300);

        // перевірка clear()
        System.out.println("Кількість перед очищенням: " + stack.size()); // 3
        stack.clear();
        System.out.println("Кількість після очищення: " + stack.size());  // 0
    }
}