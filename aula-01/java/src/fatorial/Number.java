package fatorial;

public class Number {
    
    public static boolean fatorial(int n) {
        
        if(1 > n){
            // TODO: throw error
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
