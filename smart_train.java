import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class smart_train {
    public static void main(String[] args) throws IOException{
        int people = 0, big_num = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        for(int i = 0; i < 4; i++ ){
            StringTokenizer st = new StringTokenizer(br.readLine());
            if(i == 0){
                int trash = Integer.parseInt(st.nextToken());
                people = Integer.parseInt(st.nextToken());
                big_num = people;
                continue;
            }
            int out_people = Integer.parseInt(st.nextToken());
            int in_people = Integer.parseInt(st.nextToken());

            people -= out_people;
            people += in_people;
            if(big_num <= people){
                big_num = people;
            }
        }
        System.out.println(big_num);
    }
}
