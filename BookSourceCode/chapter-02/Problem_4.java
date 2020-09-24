import java.io.*;
public class Problem_4 {
    public static void main(String[] args) throws Exception{
        int a;
        double s1 , s2 , dif ;
        final double PI = 3.1415;
        System.out.print("Enter Edge : ");
        a = read_int( );
        s1 = PI * Math.pow((double) ( a / 2. ) , 2 );
        s2 = a * a;
        dif = s2 - s1;
        System.out.println("Difference Areas is  = " + dif);
    }
   //----------------------------------------------------- 
    public static int read_int( ) throws Exception{
        BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
        String inputs = input.readLine( );
        int number = Integer.parseInt(inputs);
        return number;
    }
}
