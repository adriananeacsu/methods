public class Main {



    public static int substractionTwoNumber(int numberOne, int numberTwo){
        int result = numberOne - numberTwo;
        return result;
    }

    public static int divisionTwoNumbers(int numberOne, int numberTwo){
        double result = numberOne / numberTwo;
        return result;

    }
    public static int multiplyTwoNumbers(int numberOne, int numberTwo){
        int sum = numberOne * numberTwo;
        return sum;
    }

    public static void main(String[] args) {
        int sum = multiplyTwoNumbers(3,5);
        int sum2 = multiplyTwoNumbers(6, 9);
        int sum3 = multiplyTwoNumbers(10, 72);
    }
}