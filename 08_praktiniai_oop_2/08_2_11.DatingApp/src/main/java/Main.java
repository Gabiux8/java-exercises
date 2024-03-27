
public class Main {

    public static void main(String[] args) {
        // test your program here!
//        SimpleDate test1 = new SimpleDate(1,11,2011);
//        SimpleDate test2 - test1.afterNumberOfDays(64);
//        System.out.println(test1);
//        test1.advance();
//        System.out.println(test1);
//        System.out.println(test2);

        SimpleDate now = new SimpleDate(13, 2, 2015);
        SimpleDate afterOneWeek = now;
        afterOneWeek.advance(7);

        System.out.println("Now: " + now);
        System.out.println("After one week: " + afterOneWeek);
    }

}
