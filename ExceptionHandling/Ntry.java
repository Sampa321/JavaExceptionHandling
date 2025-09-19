package PdfNote.ExceptionHandling;

public class Ntry {
    public static void main(String[] args) {
        try{
            int a = args.length;
            int b = 23/a;
            System.out.println("a = "+a);
            try {
                if(a==1)
                {
                    a=a/(a-a);
                }
                if(a==2)
                {
                    int c[]={1};
                    c[3] = 46;
                }
            }catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Array out of bound : "+e);
            }
        }catch(ArithmeticException e)
        {
            System.out.println("Divided by 0 : "+e);
        }
    }
}
