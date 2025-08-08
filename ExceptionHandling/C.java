package ClassPractice.OOPS.ExceptionHandling;

public class C {
    static void f1(int[] a){
        System.out.println("Hello,this is f1() function");
        System.out.println("I am calling it from the main()");
        try{
            f2();
        }
        catch (NumberFormatException e)
        {
            System.out.println("I can only handle nullpointer exception");
        }
        catch (Exception e)
        {
            System.out.println("I can handle everything error in f1()");
            //return;
        }
        finally {
            System.out.println("It is must be execute that can't check handle error or not.That is finally block in f1()");
        }
        a[2]=5;
        System.out.println("After calling f2() from f1(). This line won't be executed.");
    }

    static void f2(){
        int a=10;
        int b=0;
        System.out.println("I am in f2() function");
        try{
            System.out.println(a/b);   //Arithmetic Exception-/ by 0.
        }
        finally {
            System.out.println("It is must be execute that can't check handle error or not.That is finally block in f2()");
        }

    }
    public static void main(String[] args) {
        int [] a ={1,2,3,4,6};
        System.out.println("This is main()");
        try {
            f1(a);
        }
        catch (Exception e)
        {
            System.out.println("Everything error can be handle");
        }
        System.out.println("After calling f1().This line won't be executed.");
        for (int i:a)
        {
            System.out.print(i+" ");
        };
    }
}
