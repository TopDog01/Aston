import java.util.Arrays;

class MyArrayList {
    private Object[] elements;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    public MyArrayList() {
        elements = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    public void add(Object value) {
        if (size == elements.length) {
            resize();
        }
        elements[size++] = value;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс вне диапазона: " + index);
        }
        return elements[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс вне диапазона: " + index);
        }
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null; // Удаляем ссылку на последний элемент
        size--;
    }

    public void addAll(MyArrayList other) {
        for (int i = 0; i < other.size(); i++) {
            add(other.get(i));
        }
    }

    public int size() {
        return size;
    }

    private void resize() {
        elements = Arrays.copyOf(elements, elements.length * 2);
    }
}