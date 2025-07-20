/**
 * Класс Product.
 */

class Product {
    private String partA;
    private String partB;

    public void setPartA(String partA) {
        this.partA = partA;
    }
    public void setPartB(String partB) {
        this.partB = partB;
    }

    @Override
    public String toString() {
        return "Product [partA=" + partA + ", partB=" + partB + "]";
    }
}

/**
 * Интерфейс Builder
 */

interface Builder {
    void  buildPartA();
    void  buildPartB();
    Product getProduct();
}

/**
 * Строитель
 */

class ConcreteBuilder implements Builder {
    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.setPartA("partA");
    }

    @Override
    public void buildPartB() {
        product.setPartB("partB");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}

/**
 * Директор
 */

class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }
    public Product construct() {
        builder.buildPartA();
        builder.buildPartB();
        return builder.getProduct();
    }
}