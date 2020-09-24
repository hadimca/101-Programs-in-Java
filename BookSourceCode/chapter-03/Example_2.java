public class Example_2 {
    public static void main(String[] args)throws Exception {
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle();
        rect1.readEdge();
        rect1.calculate() ;
        rect1.show();
        rect2.readEdge();
        rect2.calculate();
        rect2.show();
    }
}