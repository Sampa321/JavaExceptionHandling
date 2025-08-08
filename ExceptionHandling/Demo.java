package ClassPractice.OOPS.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {
    static void func1(int a){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        try {
            int input  = sc.nextInt();
            func2(a,input);
        }
        catch (InputMismatchException p)
        {
            System.out.println(p.toString());
            System.out.println("This is catch block of fun1().It can handle inputmismatchException");
        }
        finally {
            System.out.println("This is finally block of func1()");
        }
        System.out.println("After finally this is inside func1()");
    }
    static void func2(int a,int b){
        try {
            System.out.println("Division of two number is : "+a/b);
        }
        finally {
            System.out.println("finally() in func2()");
        }
        System.out.println("after finally block in func2()");
    }
    public static void main(String[] args) {
        int a  = 10;
        try {
            func1(a);
        }catch (Exception e)
        {
            System.out.println("This is catch block of main().The exception is : "+e.toString());
        }
        finally {
            System.out.println("This is finally block in main()");
        }
        System.out.println("After finally block and inside main()");
    }
}
