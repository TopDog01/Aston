/**
 * Интерфейс Subject
 */
interface Subject {
    void request();
}

/**
 * Real Subject
 */
class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("RealSubject: Handling request.");
    }
}

/**
 * Proxy
 */

class Proxy implements Subject {
    private RealSubject realSubject;

    @Override
    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        realSubject.request();
    }
}
