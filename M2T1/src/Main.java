public class Main {
    public static void main(String[] args) {
        // Пример использования MyHashSet
        MyHashSet mySet = new MyHashSet();
        mySet.add("Hello");
        mySet.add("World");
        mySet.add("Hello"); // Дубликат, не будет добавлен
        System.out.println("Size of MyHashSet: " + mySet.size()); // Size of MyHashSet: 2
        mySet.remove("Hello");
        System.out.println("Size of MyHashSet after removal: " + mySet.size()); // Size of MyHashSet after removal: 1

        // Пример использования MyArrayList
        MyArrayList myList = new MyArrayList();
        myList.add("One");
        myList.add("Two");
        myList.add("Three");
        System.out.println("Element at index 1: " + myList.get(1)); // Element at index 1: Two
        myList.remove(1);
        System.out.println("Element at index 1 after removal: " + myList.get(1)); // Element at index 1 after removal: Three
        System.out.println("Size of MyArrayList: " + myList.size()); // Size of MyArrayList: 2

        // Пример использования addAll
        MyArrayList anotherList = new MyArrayList();
        anotherList.add("Four");
        anotherList.add("Five");
        myList.addAll(anotherList);
        System.out.println("Size of MyArrayList after addAll: " + myList.size()); // Size of MyArrayList after addAll: 4
    }
}