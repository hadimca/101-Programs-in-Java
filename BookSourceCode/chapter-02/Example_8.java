import java.io.*;
public class Example_8 {
    public static void main(String[] args) throws Exception{
        int n;
        double m , p;
        System.out.print("Enter  a Number: ");
        n = read_int();
        m = 180 - 360.0 / n ;
        p = m * n;
        System.out.print("Summation of Angels= " + p);
    }
   //----------------------------------------------------- 
    public static int read_int() throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String inputs = input.readLine();
        int number = Integer.parseInt(inputs);
        return number;
    }
}

