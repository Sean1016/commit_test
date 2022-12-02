import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class odd_number {
    public static void main(String[] args) throws IOException{
        int sum = 0, mini = -1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 1; i <= 7; i++){
            int num = Integer.parseInt(br.readLine());

            if(num % 2 == 1){
                sum += num;
                if(mini == -1){
                    mini = num;
                }else if(mini > num){
                    mini = num;
                }

            }
        }

        if(sum == 0 && mini == -1){
            System.out.println(-1);
        }else{
            System.out.println(sum);
            System.out.println(mini);
        }
    }
}
