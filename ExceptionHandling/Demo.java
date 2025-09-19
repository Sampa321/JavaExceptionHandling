package PdfNote.ExceptionHandling;

public class Demo {
    public static void main(String[] args) {
        try {
            PA();
        }catch (Exception e)
        {
            System.out.println("Exception caught");
        }
        PB();
        PC();
    }
    static void PA(){
        try{
            System.out.println("In a");
            throw new RuntimeException("demoA");
        }finally {
            System.out.println("A finally");
        }
    }
    static void PB(){
        try{
            System.out.println("In B");
            return;
        }
        finally {
            System.out.println("B finally");
        }
    }
    static void PC(){
        try{
            System.out.println("In C");
            return;
        }
        finally {
            System.out.println("C finally");
        }
    }
}
