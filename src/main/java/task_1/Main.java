package task_1;

public class Main {
    public static void main(String[] args) {
        try {
            Box box = new Box(3, 4, 5);

            System.out.println("Площа поверхні: " + box.getSurfaceArea());
            System.out.println("Площа бічної поверхні: " + box.getLateralSurfaceArea());
            System.out.println("Об'єм: " + box.getVolume());

            Box invalidBox = new Box(0, 2, 3);
        } catch (IllegalArgumentException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}
