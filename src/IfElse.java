public class IfElse {
    public static void main(String[] args) {
        int x = -1;
        int y = 98;
        testNumber(x);
        evenOdd(y);
    }


    public static void testNumber(int x) {
        if (x > 0) {
            System.out.println("positive");
        } else if (x < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }

    }

    public static void evenOdd(int y) {
        if (y % 2 == 0) {
            System.out.println("Even");
        }  else {
            System.out.println("Odd");
        }
    }
}


