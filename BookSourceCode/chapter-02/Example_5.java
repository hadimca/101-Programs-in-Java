import java.io.*;
public class Example_5 {
    public static void main(String[] args) throws Exception{
        int r;
        double p, a;
        final double PI = 3.1415;
        System.out.print(" Enter Radius : ");
        r = read_int();
        p = 2 * PI * r;
        a = PI * r * r;
        System.out.println(" Area is = " + a );
        System.out.print(" Perimeter is = " + p );
    }
   //----------------------------------------------------- 
    public static int read_int() throws Exception{
        BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
        String inputs = input.readLine( );
        int number = Integer.parseInt(inputs);
        return number;
    }
}
