package fibonacci;

public class Number {
    
    public static int fibonacci(int n) {
        
        int a = 0;
        int c = 1;
        
        if(n == 0 || n == 1){
            return n;
        }
        
        int i = 2;
        int t;
        
        while(i <= n){
            t = c;
            c = c + a;
            a = t;
            i++;
        }
        
        return c;
        
    }
}
