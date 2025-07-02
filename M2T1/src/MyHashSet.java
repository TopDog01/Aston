import java.util.Arrays;

class MyHashSet {
    private Object[] elements;
    private int size;
    private static final int INITIAL_CAPACITY = 16;

    public MyHashSet() {
        elements = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    public void add(Object value) {
        if (contains(value)) {
            return; // Элемент уже существует
        }
        if (size == elements.length) {
            resize();
        }
        elements[size++] = value;
    }

    public void remove(Object value) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(value)) {
                elements[i] = elements[size - 1]; // Заменяем удаляемый элемент последним
                elements[size - 1] = null; // Удаляем ссылку на последний элемент
                size--;
                return;
            }
        }
    }

    public boolean contains(Object value) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(value)) {
                return true;
            }
        }
        return false;
    }

    private void resize() {
        elements = Arrays.copyOf(elements, elements.length * 2);
    }

    public int size() {
        return size;
    }
}
