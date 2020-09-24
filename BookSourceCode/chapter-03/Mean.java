public class Mean{
    private double num1 , num2 , num3;
    private double ave;
    public Mean(){
     }
    public Mean(double i, double j , double k){
        num1 = i;
        num2 = j;
        num3 = k;
    }
    public void setNum(double i, double j, double k){
        num1 = i;
        num2 = j;
        num3 = k;
    }
    public double getAve(){
        cal();
        return ave;
    }
    private void cal(){
        ave = (num1 + num2 + num3)/3.;
    }
}
