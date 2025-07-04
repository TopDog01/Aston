public class Main {
    public static void main(String[] args) {

        MyHashSet mySet = new MyHashSet();
        mySet.add("Hello");
        mySet.add("World");
        mySet.add("Hello");
        System.out.println("Size of MyHashSet: " + mySet.size());
        mySet.remove("Hello");
        System.out.println("Size of MyHashSet after removal: " + mySet.size());


        MyArrayList myList = new MyArrayList();
        myList.add("One");
        myList.add("Two");
        myList.add("Three");
        System.out.println("Element at index 1: " + myList.get(1));
        myList.remove(1);
        System.out.println("Element at index 1 after removal: " + myList.get(1));
        System.out.println("Size of MyArrayList: " + myList.size());


        MyArrayList anotherList = new MyArrayList();
        anotherList.add("Four");
        anotherList.add("Five");
        myList.addAll(anotherList);
        System.out.println("Size of MyArrayList after addAll: " + myList.size());
    }
}