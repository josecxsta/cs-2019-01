package razaoAurea;

public class Number {
    
    public static int razaoAurea(int x, int y, int k) {
        
      int c = y;
      int a = x;
      int i = 1;

      while(i <= k){
          t = c;
          c = c + a;
          a = t;
          i++;
      }

      final int response = c/a;

      return response;
        
    }
}
