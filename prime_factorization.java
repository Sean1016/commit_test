import java.util.Scanner;

public class prime_factorization{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();

        for(int i = 2; i <= num; i++){
            while(num % i == 0){
                num = num / i;
                System.out.println(i);
            }
        }
    }    
}