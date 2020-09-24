import java.io.*;
public class Problem_6 {
    public static void main(String[] args) throws Exception{
        int x1 , x2 ,y1 , y2;
        double m ;
        System.out.print("Enter First Point x : ");
        x1 = read_int( );
        System.out.print("Enter First Point y : ");
        y1 = read_int( );
        System.out.print("Enter Second Point x : ");
        x2 = read_int( );
        System.out.print("Enter Second Point y : ");
        y2 = read_int( );
        m = (double)( y2 - y1 ) / ( x2 - x1 ) ;
        System.out.println("Slope of Line is  = " + m);
    }
   //----------------------------------------------------- 
    public static int read_int( ) throws Exception{
        BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
        String inputs = input.readLine( );
        int number = Integer.parseInt(inputs);
        return number;
    }
}
