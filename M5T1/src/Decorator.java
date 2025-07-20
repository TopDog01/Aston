/**
 * Интерфейс компонента
 */
interface Component {
    void operation();
}

/**
 * Компонент
 */
class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("ConcreteComponent: Operation.");
    }
}

/**
 * Декоратор
 */

class Decorator implements Component {
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }
    @Override
    public void operation() {
        component.operation();
    }
}

class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }
    @Override
    public void operation() {
        super.operation();
        System.out.println("ConcreteDecorator: Additional operation.");
    }
}
