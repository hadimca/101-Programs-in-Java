import java.io.*;
public class Example_4 {
    public static void main(String[] args) throws Exception{
        int a,b,c;
        System.out.print("Enter First Number: ");
        a = read_int();
        System.out.print("Enter Second Number: ");
        b = read_int();
        c = a + b;
        System.out.print("Summation of the Two Numbers= " + c );
    }
   //----------------------------------------------------- 
    public static int read_int() throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String inputs = input.readLine();
        int number = Integer.parseInt(inputs);
        return number;
    }
}