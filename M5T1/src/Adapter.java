/**
 * Целевой интерфейс
 */

interface Target {
    void request();
}

/**
 * Реальный класс, который нужно адаптировать.
 */
class Adaptee {
    public void specificRequest() {
        System.out.println("Adaptee: specificRequest");
    }
}

/**
 * Адаптер
 */

class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter (Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
