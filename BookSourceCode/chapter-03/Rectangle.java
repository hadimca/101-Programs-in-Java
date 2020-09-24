public class Rectangle {
    private double edge;
    private double area;
    private double perimeter;
    public void readEdge()throws Exception{
        System.out.print("\n Enter Edge : ");
        edge = IONumber.read_doub();
    }
    //----------------------------------------
    public void calculate(){
        area = edge * edge;
        perimeter = 4 * edge;
    }
    //-----------------------------------------
    public void show(){
        System.out.println(" Area is = " + area);
        System.out.print(" Perimeter is = "  + perimeter);
    }
}
