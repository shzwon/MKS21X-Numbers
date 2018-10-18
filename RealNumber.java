public class RealNumber{
  private double value;

  public RealNumber(double x) {
    value = x;
}

  public double getValue() {
	  return value;
}

  public String toString(){
    return "" + value;
  }

  public double add(RealNumber other){
    return value + other.getValue();
  }

  public double subtract(RealNumber other){
   return value - other.getValue();
 }

 public double multiply(RealNumber other){
   return value * other.getValue();
 }

 public double divide(RealNumber other){
    return value/other.getValue();
  }

  public double compareTo(double y, double z){
    return 0;
  }
}
