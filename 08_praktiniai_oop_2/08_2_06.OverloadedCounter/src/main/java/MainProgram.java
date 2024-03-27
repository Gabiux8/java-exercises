
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter first = new Counter();
        Counter second = new Counter(2);
        System.out.println(first.value());
        System.out.println(second.value());
        first.increase();
        second.increase();
        System.out.println(first.value());
        System.out.println(second.value());
        first.decrease(4);
        second.decrease(5);
        System.out.println(first.value());
        System.out.println(second.value());
    }
}
