package PdfNote.ExceptionHandling;

public class ExcepA {
    public static void main(String[] args) {
        int d,a;
        try {
            d=0;
            a=12/d;
            System.out.println("This won't be printed");
        }catch (ArithmeticException e)
        {
            System.out.println("Divided by 0");
        }
        System.out.println("After catch statement!");
    }
}
