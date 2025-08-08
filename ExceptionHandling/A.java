package ClassPractice.OOPS.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A {
    float a;

    public static void main(String[] args) {
        A obj = new A();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for a:");
        try{
            obj.a = sc.nextFloat();

            //throw new NumberFormatException("Hello,My name is sampa nayak");
            System.out.println("Division is : "+obj.a/0);
        }
        catch (InputMismatchException anyName)
        {
            System.out.println(anyName.getMessage());
            System.out.println("Exception : "+anyName);
        }
        catch (NumberFormatException anything)
        {
            System.out.println("NumberFormatException msg: "+anything.getMessage());
        }
        catch (Exception e)
        {
            System.out.println("Exception is : "+e.getMessage());
            System.out.println("Exception : "+e);
        }
        System.out.println("Yeah,i took input from user.So much hardwork!!");
        System.out.println("Value of a is : "+obj.a);
    }
}
