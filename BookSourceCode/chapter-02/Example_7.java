import java.io.*;
public class Example_7 {
    public static void main(String[] args) throws Exception{
        double a , b , c ;
        System.out.print("Enter Two Numbers: ");
        a = read_doub();
        b = read_doub();
        c = ( Math.sqrt(a) + Math.sqrt(b)) / 2 ;
        System.out.print("\n Result is = " +  c);
    }
//-----------------------------------------------------------------    
    public static double read_doub( ) throws Exception{
        BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
        String inputs = input.readLine( );
        double number = Double.parseDouble(inputs);
        return number;
    }
}
