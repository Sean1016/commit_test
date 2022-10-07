import java.util.Scanner;

public class sosu_2{
    public static int isPrime(int num){
        if(num == 1){
            return 0;
        }

        for(int i=2; i<num; i++){
            if(num % i == 0){
                return 0;
            }
        }
        return num;
    }

    public static void main(String[] args){
        int sum = 0, num = 0, min = 10001;

        Scanner sc = new Scanner(System.in);
        int start_num = sc.nextInt();
        int end_num = sc.nextInt();

        for(int i = start_num; i <= end_num; i++){
            num = isPrime(i);
            if(min > num && num != 0){
                min = num;
            }
            sum += num;
        }

        if(sum != 0){
            System.out.println(sum);
            System.out.println(min);
        }else{
            System.out.println(-1);
        }
    }
}