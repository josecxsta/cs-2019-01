package raizQuadrada;

public class Number {
    
    public static int raizQuadrada(int x, int y) {
        
        int r = 1;
        
        while(0 <= y){
            r = (r + (x/r))/2;
            y = y - 1;
        }
        
        return r;
        
    }
}
