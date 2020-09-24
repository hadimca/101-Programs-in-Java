public class Example_11{
    public static void main(String[] args) throws Exception{
        int a;
        System.out.print("Enter First Number : ");
        a = read_int();
        print_num(a);
    }
   //----------------------------------------------------- 
    public static void print_num(int m){
        System.out.print(" You Entered: " + m );
    }
   //----------------------------------------------------- 
    public static int read_int() throws Exception{
        java.io.BufferedReader input = new java.io.BufferedReader
           (new java.io.InputStreamReader(System.in));
        String inputs = input.readLine( );
        int number = Integer.parseInt(inputs);
        return number;
    }
}
