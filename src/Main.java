class Recursion {
  
  public long factorial(int n) {
    long res;
    if(n == 1) return 1;
    else res = factorial(n - 1) * n;
    return res;
  }
  
  public long binaryInteger(long n, int base) {
    long res;
    if(n / 2 == 0) {
      System.out.println("first block: " + n % 2);
      return n % 2;
    }
    else { 
      res = binaryInteger(n / 2, 2) * 10 + n % 2; 
      System.out.println("second block: " + (binaryInteger(n / 2, 2) * 10 + n % 2));
    }
    return res;
  }
  
  public double rec(int n) {
   	double precision = 0.1;
    double res;
    if(n == 1) return 1;
    else res = rec(n / 2) * 30;
    return res * precision;
  }
  
  public String sequence(int n) {
    if(n == 1) return "1";
    else return sequence(n - 1) + " " + n;
  }
  
  public String mulSequence(int n, int end) {
    if(end == 1) return "\r";
    else return mulSequence(n, end - 1) + "\n" + n + " * " + end + " = " + n * end;
  }
  
  
  public String divSequence(double n, int div) {
    if(div == 1) return "";
    else return divSequence(n, div - 1) + "\n" + n + " / " + div + " = " + n / div; 
  }

  public String ascendingSequence(int a, int b) {
    // ascending
    if(a > b) {
      
      if(a == b) return String.valueOf(a);
      else return a + "\n" + ascendingSequence(a - 1, b);
      
    } else {
      //waning
      if(b == a) return String.valueOf(b);
      else return a + "\n" + ascendingSequence(a + 1, b);
      
    }  
  }   
  

}

public class Main {
  public static void main(String[] args) {
    Recursion r = new Recursion();
    System.out.println(r.divSequence(9, 9));
  }
}