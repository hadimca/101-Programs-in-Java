import java.io.*;
public class Problem_1{
    public static void main(String[] args) throws Exception{
        int r;
        double v,a;
        final double PI = 3.1415;
        System.out.print("Enter Radious: ");
        r = read_int( );
        v = 4/3. * PI * Math.pow((double) r , 3);
        a = 4 * PI * r * r;
        System.out.println("Area is  = " + a);
        System.out.print("Volume is  = " + v);
    }
   //----------------------------------------------------- 
    public static int read_int( ) throws Exception{
        BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
        String inputs = input.readLine( );
        int number = Integer.parseInt(inputs);
        return number;
    }
}
