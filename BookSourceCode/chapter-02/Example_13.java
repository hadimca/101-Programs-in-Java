import java.io.*;
public class Example_13{
    private static int  sum_int;
    private static double  sum_doub;
    public static void main(String[] args) throws Exception{
        int a , b ;
        double c , d ;
        System.out.print("Enter First Integer Number : ");
        a = read_int();
        System.out.print("Enter Second Integer Number : ");
        b = read_int();
        System.out.print("Enter First Double Number : ");
        c = read_doub();
        System.out.print("Enter Second Double Number : ");
        d = read_doub();
        summation( a , b );
        summation( c , d );
        System.out.println("Summation of Two Integer Numbers is = " + sum_int);
        System.out.print("Summation of Two Double Numbers is = " + sum_doub);
    }
   //----------------------------------------------------- 
    public static void summation(int  m ,int  n){
        sum_int = m + n;
    }
   //----------------------------------------------------- 
    public static void summation(double  m ,double  n){
        sum_doub = m + n;
    }
   //----------------------------------------------------- 
    public static int read_int( ) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String inputs = input.readLine( );
        int number = Integer.parseInt(inputs);
        return number;
    }
   //----------------------------------------------------- 
    public static double read_doub( ) throws Exception{
        BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
        String inputs = input.readLine( );
        double number = Double.parseDouble(inputs);
        return number;
    }
}
