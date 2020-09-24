public class Example_3 {
    public static void main(String[] args)throws Exception  {
        Mean vm = new Mean(10 , 20 , 40 );
        Mean vt ;
        double a , b , c;
        double average1, average2, average3;
        average1= vm.getAve();
        System.out.print(" Average of 10 , 20 , 30 is = " + average1);
        System.out.print("\n Enter First Number : ");
        a = IONumber.read_doub();
        System.out.print("\n Enter Second Number : ");
        b = IONumber.read_doub();
        System.out.print("\n Enter Third Number : ");
        c = IONumber.read_doub();
        vt = new Mean(a, b, c);
        average2= vt.getAve();
        System.out.print(" Average of " + a + " , " + b + " , " + c +  " is = " + average2);
        Mean vu = new Mean();
        vu.setNum( 12 , 22 , 24);
        average3= vu.getAve();
        System.out.print("\n Average of 12 , 22 , 24 is = " + average3);
    }
}
