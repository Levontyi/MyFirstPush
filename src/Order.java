public class Order {

    private long count = 1;

    public Order() {
    }

    public Order(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Order has count: " + count;
    }
}

