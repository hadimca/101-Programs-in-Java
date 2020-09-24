import java.io.*;
public class Example_6 {
     public static void main( String[] args) throws Exception {
        int a , b , c , d , e;
        System.out.print("Enter Five Numbers: ");
        a = read_int();
        b = read_int();
        c = read_int();
        d = read_int();
        e = (int) Math.pow((double) a , 2);
        e = e + (int)Math.pow((double) b , 2);
        e = e + (int)Math.pow((double) c , 2);
        e = e + (int)Math.pow((double) d , 2);
        System.out.print(" \n Result is = " + e);
    }
    //-----------------------------------------------------------------    
    public static int read_int( ) throws Exception {
        BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
        String inputs = input.readLine( );
        int number = Integer.parseInt(inputs);
        return number;
    }
}
