import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class dice_three {
    public static int big_num(int[] array_n){
        Arrays.sort(array_n);
        
        return array_n[array_n.length - 1];
    }

    public static void main(String[] args)throws IOException{
        int money = 0;
        int[] money_three;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        money_three = new int[tc];

        for(int i = 0; i < tc; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num_1 = Integer.parseInt(st.nextToken());
            int num_2 = Integer.parseInt(st.nextToken());
            int num_3 = Integer.parseInt(st.nextToken());

            if(num_1 == num_2 && num_2 == num_3){
                money = 10000 + (num_1 * 1000);
            }else if(num_1 == num_2){
                money = 1000 + (num_1 * 100);
            }else if(num_1 == num_3){
                money = 1000 + (num_1 * 100);
            }else if(num_2 == num_3){
                money = 1000 + (num_2 * 100);
            }else{
                int[] array_n = {num_1, num_2, num_3};
                money = (big_num(array_n) * 100);
            }

            money_three[i] = money;
        }

        int big_num = big_num(money_three);
        System.out.println(big_num);

    }
}
