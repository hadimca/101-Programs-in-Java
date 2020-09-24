import java.io.*;
public class Example_1 {
    public static void main(String[] args)throws Exception {
        int a;
        double p , q;
        System.out.print(" Enter First Number as Integer : ");
        a = IONumber.read_int();
        System.out.print("\n Enter Second Number as Double : ");
        p = IONumber.read_doub();
        q = a + p;
        System.out.print( "\n Summation of Two Numbers is = " + q);
    }
}

