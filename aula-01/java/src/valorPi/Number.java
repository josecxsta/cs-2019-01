package valorPi;

public class Number {
    
    public static int valorPi(int n) {
        
        int i = 1;
        int s = -1;
        int d = -1;
        int p = 0;
        
        while(i <= n){
            d = d + 2;
            s = -1 * s;
            p = p + (4 * s / d);
            i = i + 1;
        }
        
        return p;
        
    }
}
