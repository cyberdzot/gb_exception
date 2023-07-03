package Homework01;

public class Main {
    public static void main(String[] args) {
        try {
            // divideByZero();
            // countNullValue();
            getInvalidArrayAccess();
        } catch (ArithmeticException e1) {
            System.out.println(e1);
        } catch (NullPointerException e2) {
            System.out.println(e2);
        } catch (ArrayIndexOutOfBoundsException e3) {
            System.out.println(e3);
        }
    }

    // ArithmeticException
    // private static void divideByZero() {
    //     int div = 10 / 0;
    //     System.out.println(div);
    // }

    // NullPointerException
    // private static void countNullValue() {
    //     String text = null;
    //     System.out.println(text.length());
    // }

    // ArrayIndexOutOfBoundsException
    private static void getInvalidArrayAccess() {
        int[] array = { 1, 2, 3 };
        System.out.println(array[100]);
    }
}
