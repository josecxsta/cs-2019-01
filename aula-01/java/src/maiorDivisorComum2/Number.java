package maiorDivisorComum2;

public class Number {
    
    public static int maiorDivisorComum(int a, int b) {
        
      while(a != b) {
        
        if(a > b) {
            a = a - b; 
        } else {
            b = b - a;
        } 

      } 
    
      return a;
        
    }
}
