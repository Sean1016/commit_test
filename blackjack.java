import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class blackjack {
    public static void main(String[] args) throws IOException{
        //브루트포스 블랙잭

        int check_num = 0;
        int sum = 0, result = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int card_count = Integer.parseInt(st.nextToken());
        int max_num = Integer.parseInt(st.nextToken());

        int[] array = new int[card_count];

        st = new StringTokenizer(br.readLine());

        while(st.hasMoreTokens()){
            array[check_num] = Integer.parseInt(st.nextToken());
            check_num++;
        }
        
        for(int i = 0; i < array.length - 2; i++){
            for(int j = 1; j < array.length- 1; j++){
                if(array[i] == array[j]){
                    continue;
                }
                for(int k = 2; k < array.length; k++){
                    if(array[i] == array[k] || array[j] == array[k]){
                        continue;
                    }
                    sum = array[i] + array[j] + array[k];
                    if((sum <= max_num) && (max_num - sum) < (max_num - result)){
                        result = sum;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
