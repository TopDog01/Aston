public class Hierarchy {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Bear bear = new Bear();
        Whale whale = new Whale();
        Fish fish = new Fish();

        System.out.println("Кошка: ");
        System.out.println("имеет шерсть: " + cat.hasFur());

        System.out.println("\nМедведь: ");
        System.out.println("имеет шерсть: " + bear.hasFur());

        System.out.println("\nКит: ");
        System.out.println("имеет шерсть: " + whale.hasFur());

        System.out.println("\nРыба: ");
        System.out.println("имеет позвоночник: " + fish.hasSpine());
    }
}
