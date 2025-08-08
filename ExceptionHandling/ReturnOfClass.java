package ClassPractice.OOPS.ExceptionHandling;

import java.io.CharConversionException;

public class ReturnOfClass {
    static void func1() throws CharConversionException{
        try {
            throw new CharConversionException("ja dite chao dao");
        }
        finally {
            System.out.println("Yo!");
        }
    }

    public static void main(String[] args) {
        try {
            func1();
        }catch (NullPointerException | CharConversionException f)
        {
            System.out.println(f);
        }
    }
}
