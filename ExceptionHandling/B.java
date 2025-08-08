package ClassPractice.OOPS.ExceptionHandling;

public class B {
    static void f1(){
        System.out.println("Hello,this is f1() function");
        System.out.println("I am calling it from the main()");
        f2();
        System.out.println("After calling f2() from f1(). This line won't be executed.");
    }

    static void f2(){
        int a=10;
        int b=0;
        System.out.println("I am in f2() function");
        try{
            System.out.println(a/b);   //Arithmetic Exception-/ by 0.
        }catch (Exception e)
        {
            System.out.println("Exception is : "+e);
        }

    }
    public static void main(String[] args) {
        System.out.println("This is main()");
        f1();
        System.out.println("After calling f1().This line won't be executed.");
    }
}
