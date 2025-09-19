package PdfNote.ExceptionHandling;

public class DemoThrow {
    static void demoproc(){
        try {
            throw new NullPointerException("demo");
        }catch (NullPointerException e)
        {
            System.out.println("Caught in demoProc");
        }
    }
    public static void main(String[] args) {
        try {
            demoproc();
        }catch (NullPointerException e){
            System.out.println("Recaught : "+e);
        }
    }
}
