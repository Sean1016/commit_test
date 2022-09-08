import java.util.*;

public class clock{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt(); 
        int minus_M;
        int minus_H;
        
        minus_M = M - 45;
        
        if(minus_M >= 0){
        	System.out.println(H + " " + minus_M);
        }else if(minus_M < 0) {
            int sixteen = 60;
        	M = sixteen + minus_M;
        	if(H == 0) {
        		minus_H = 23;
        		System.out.println(minus_H + " " + M);
        	}else {
        		minus_H = H - 1;
        		System.out.println(minus_H + " " + M);
        	}
        }
        
    }
}