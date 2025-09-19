package PdfNote.ExceptionHandling;

public class A {
    public static void main(String[] args) {
        try{
            throwOne();
        }catch (IllegalAccessException e)
        {
            System.out.println("exception : "+e);
        }
    }
    public static void throwOne() throws IllegalAccessException{
        throw new IllegalAccessException("demo");
    }
}
