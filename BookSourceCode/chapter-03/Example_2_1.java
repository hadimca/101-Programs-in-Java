public class Example_2_1{
    public static void main(String[] args)throws Exception {
        Rectangle1 rect1 = new Rectangle1( );
        double a , b , c;
        System.out.print("\n Enter Edge : ");
        a = IONumber.read_doub();
        rect1.setEdge(a);
        rect1.calculate();
        b = rect1.getArea();
        c = rect1.getPerimeter();
        System.out.println(" Area is = " + b);
        System.out.print(" Perimeter is = "  + c);
    }
    
}