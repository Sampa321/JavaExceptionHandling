package ClassPractice.OOPS.ExceptionHandling;

import java.io.CharConversionException;
import java.util.InputMismatchException;

public class SecondLastClass {
    static void fun1(){
        try {
            throw new CharConversionException("Khide legeche");

        }catch (NullPointerException | CharConversionException | InputMismatchException e)
        {
            System.out.println(e.toString());
        }
    }

    public static void main(String[] args) {
        fun1();
        try {
            throw new CucumberlsAVegetable("Tui jantish na?");
        }catch (CucumberlsAVegetable e)
        {
            System.out.println(e);
        }
    }
}
