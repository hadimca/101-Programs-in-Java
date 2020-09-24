import java.io.*;
public class Problem_3 {
    public static void main(String[] args) throws Exception{
        int r;
        double d ;
        final double PI = 3.1415;
        System.out.print("Enter Angle in Radian : ");
        r = read_int();
        d = ( 360 * r ) / ( 2 * PI);;
        System.out.println("Angle in Degree is  = " + d);
    }
   //----------------------------------------------------- 
    public static int read_int( ) throws Exception{
        BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
        String inputs = input.readLine( );
        int number = Integer.parseInt(inputs);
        return number;
    }
}
