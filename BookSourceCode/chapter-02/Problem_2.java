import java.io.*;
public class Problem_2 {
    public static void main(String[] args) throws Exception{
        int y1 , y2 , age;
        double v,a;
        System.out.print("Enter Year in Solar : ");
        y1 = read_int( );
        y2 = y1 + 621;
        age = 1386 - y1;
        System.out.println("Year in  A.D. is = " + y2);
        System.out.print("His age  is = " + age);
    }
   //----------------------------------------------------- 
    public static int read_int( ) throws Exception{
        BufferedReader input = new BufferedReader  (new InputStreamReader(System.in));
        String inputs = input.readLine(  );
        int number = Integer.parseInt(inputs);
        return number;
    }
}
