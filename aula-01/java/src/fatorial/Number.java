package fatorial;

public class Number {
    
    public static int fatorial(int n) {
        
        if(1 > n){
            throw new IllegalArgumentException();
        }
        
        int i = 2; 
        int f = 1; 
        
        while(i <= n) {
            f = f * i; 
            i = i + 1; 
        } 
        
        return f;
        
    }
}
