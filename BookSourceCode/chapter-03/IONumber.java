import java.io.*;
public class IONumber{
    public static int read_int() throws Exception{
        BufferedReader input = new 
						BufferedReader(new InputStreamReader(System.in));
        String inputs = input.readLine( );
        int number = Integer.parseInt(inputs);
        return number;
    }
   //----------------------------------------------------- 
    public static double read_doub( ) throws Exception{
        BufferedReader input = new 
						BufferedReader(new InputStreamReader(System.in));
        String inputs = input.readLine( );
        double number = Double.parseDouble(inputs);
        return number;
    }    
}
