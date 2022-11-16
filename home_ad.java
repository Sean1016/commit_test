import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class home_ad{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            int answer = 0;
            String num_str = br.readLine();
            if(Integer.parseInt(num_str) == 0){
                break;
            }
            for(int i = 0; i < num_str.length(); i++){
                int num = Integer.parseInt(num_str.substring(i, i+1));
                if(num == 0){
                    answer += 4;
                }else if(num == 1){
                    answer += 2;
                }else{
                    answer += 3;
                }
            }
            System.out.println(answer + 2 + ((num_str.length())-1));
        }
    }
}
