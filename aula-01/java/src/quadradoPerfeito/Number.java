package quadradoPerfeito;

public class Number {
    
    public static boolean quadradoPerfeito(int n) {
        
        int i = 1;
        int s = 1;
        
        while(s < n){
            i = i + 2;
            s = s + 1;
        }
        
        return (s == n);
        
    }
}
