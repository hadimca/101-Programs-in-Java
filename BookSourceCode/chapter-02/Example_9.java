import java.io.*;
public class Example_9 {
    public static void main(String[] args) throws Exception{
        int m , n;
        double p , q;
        System.out.print("Enter First Number: ");
        m = read_int();
        System.out.print("Enter Second Number: ");
        n = read_int();
        p = method1( m , n );
        q = method2( m , n );
        System.out.println("Arithmatic Mean is = " + p);
        System.out.print("Geometric Mean is = " + q);
    }
   //----------------------------------------------------- 
    public static double method1(int a , int b ){
        double t;
        t = ( a + b ) / 2.0;
        return t;
    }
    //-----------------------------------------------------
    public static double method2(int a , int b ){
        double t;
        t = Math.sqrt( a * b ); 
        return t;
    }
    //-----------------------------------------------------
    public static int read_int() throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String inputs = input.readLine( );
        int number = Integer.parseInt( inputs );
        return number;
    }
}

