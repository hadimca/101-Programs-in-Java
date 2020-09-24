import java.io.*;
public class Problem_7 {
    public static void main(String[ ] args) throws Exception{
        int day , hour , min , second ;
        System.out.print("Enter Number of Days : ");
        day = read_int( );
        hour = day * 24;
        min = hour * 60;
        second = min * 60;
        System.out.println( day + " Days = " + hour + " Hours ");
        System.out.println( day + " Days = " + min + " Minutes ");
        System.out.println( day + " Days = " + second + " Seconds ");
    }
   //----------------------------------------------------- 
    public static int read_int( ) throws Exception{
        BufferedReader input = new BufferedReader  (new InputStreamReader(System.in));
        String inputs = input.readLine( );
        int number = Integer.parseInt(inputs);
        return number;
    }
}
