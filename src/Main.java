public class Main {
    public static void main(String[] args) {
        int a = 6;
        int b = 6;
        int c = 7;
        int d = 9;
        boolean bl = a == b;
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a == b");
        }

        if (a == b) {
            if (c > d) {
                System.out.println("c>d");
            } else {
                System.out.println("c<d");
            }
        }
    }
}
