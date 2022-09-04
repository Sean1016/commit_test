import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class pra_1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int all_sum = Integer.parseInt(br.readLine());
        int products_num = Integer.parseInt(br.readLine());
        int sum = 0;

        for(int i = 0; i < products_num; i++){
            st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            sum += num1 * num2;
        }

        if(all_sum == sum){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
