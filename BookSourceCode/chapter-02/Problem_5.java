import java.io.*;
public class Problem_5 {
    public static void main(String[] args) throws Exception{
        int c;
        double f ;
        System.out.print("Enter Temperature in Celsius : ");
        c = read_int( );
        f = 1.8 * c + 32 ;
        System.out.println("Temperature in Fahrenheit is  = " + f);
    }
   //----------------------------------------------------- 
    public static int read_int( ) throws Exception{
        BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
        String inputs = input.readLine( );
        int number = Integer.parseInt(inputs);
        return number;
    }
}
