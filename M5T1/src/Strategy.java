/**
 * Интерфейс стратегии.
 */


interface Strategy {
    int doOperation(int num1, int num2);
}

/**
 * Реализации стратегии сложения.
 */

class Addition implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}

/**
 * Реализация стратегии вычитания.
 */

class Subtraction implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}

/**
 * Контекст, использующий стратегию.
 */

class Context {
    private Strategy strategy;

    public  Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}