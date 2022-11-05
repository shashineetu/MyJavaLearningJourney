public class Calculator {
    public static void main(String[] args) {
        int a = 2;
        int b = 2;
        int c = 5;
    }

        public static int sum ( int a, int b){
            int sum = a + b;
            System.out.println("Addition = " + (sum));
            return sum;
        }
        public static int subtract ( int a, int b){
            int subtract = a - b;
            System.out.println("Subtraction = " + (subtract));
            return subtract;
        }

        public static int multiply ( int a, int b){
            int multiply = a * b;
            System.out.println("Multiplication = " + (multiply));
            return multiply;
        }

        public static int divide ( int a, int b){
            int divide = a / b;
            System.out.println("Division of = " + (divide));
            return divide;

        }

    }
