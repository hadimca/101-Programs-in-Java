public class Rectangle1{
    private double edge;
    private double area;
    private double perimeter;
    public void setEdge(double d){
        edge = d;
    }
    //----------------------------------------
    public void calculate(){
        area = edge * edge;
        perimeter = 4 * edge;
    }
    //-----------------------------------------
    public double getArea(){
        return area;
    }
    //-----------------------------------------
    public double getPerimeter(){
        return perimeter;
    }
}