import java.io.*;
public class IONumber1 {
public int read_int() throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String inputs = input.readLine();
        int number = Integer.parseInt(inputs);
        return number;
    }
   //----------------------------------------------------- 
    public double read_doub() throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String inputs = input.readLine();
        double number = Double.parseDouble(inputs);
        return number;
    }    
}
