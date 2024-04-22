public class APLine
{
  private double a, b, c;
  public APLine(double vala, double valb, double valc){
    a = vala;
    b = valb;
    c = valc;
  }
  public double getSlope(){
    return -a/b;
  }
  public boolean isOnLine(double x, double y){
    if((a*x + b*y + c) == 0){
      return true;
    }
    return false;
  }
}
