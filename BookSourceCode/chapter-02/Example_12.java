import java.io.*;
public class Example_12{
    private static int sum;
    public static void main(String[] args) throws Exception{
        int a , b ;
        System.out.print("Enter First Number : ");
        a = read_int();
        System.out.print("Enter Second Number : ");
        b = read_int();
        summation( a , b);
        System.out.print(" Summation of Two Numbers is = " + sum);
    }
   //----------------------------------------------------- 
    public static void summation(int  m ,int  n){
        sum = m + n;
    }
   //----------------------------------------------------- 
    public static int read_int( ) throws Exception{
        BufferedReader input = new BufferedReader(new  InputStreamReader(System.in));
        String inputs = input.readLine( );
        int number = Integer.parseInt(inputs);
        return number;
    }
}
