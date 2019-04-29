package maiorDivisorComum;

public class Number {
    
    public static int maiorDivisorComum(int x, int y) {
        
      int m;
      
      while(y != 0) {
        m = x % y;
        x = y;
        y = m;
      }
      
      return x;
        
    }
}
