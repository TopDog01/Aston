/**
 * Абстрактный класс обработчика.
 */

abstract class Handler {
    protected Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(int request);
}

/**
 * Конкретный обработчик для уровня 1.
 */

class ConcreteHandler extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request == 1) {
            System.out.println("Handler 1 handler request " + request);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}

/**
 * Для уровня 2.
 */

class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request == 2) {
            System.out.println("Handler 2 handler request " + request);
        }  else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
