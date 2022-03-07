public class Test {
    public static int test1(Primary instance) {
        return switch (instance) {
            case BPrimary b -> b.test();
            case CPrimary c -> c.test();
        };
    }

    public static int test2(Secondary instance) {
        return switch (instance) {
            case BSecondary b -> b.test();
            case CSecondary c -> c.test();
        };
    }

    public static void main(String[] args) {
        System.out.println("Test1: " + test1(new BPrimary()));
        System.out.println("Test2: " + test2(new BSecondary()));
    }
}
