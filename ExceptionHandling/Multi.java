package PdfNote.ExceptionHandling;

public class Multi {
    public static void main(String[] args) {
        try {
            int a=args.length;
            System.out.println("a = "+a);
            int b = 23/a;
            int c[] = {1};
            c[23] = 34;
        }catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
