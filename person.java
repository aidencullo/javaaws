public class Main {
    public static void main(String[] args) {
        ImmutableClass obj = new ImmutableClass(10);
        System.out.println("Value: " + obj.getValue());
    }
}

final class ImmutableClass {
    private final int value;

    public ImmutableClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
