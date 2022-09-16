import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.Arrays;

public class price_st{
    public static void main(String[] args){
        int st_arr[] = new int[2];
        int score_arr[];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            StringTokenizer st = new StringTokenizer(br.readLine());
            st_arr[0] = Integer.parseInt(st.nextToken());
            st_arr[1] = Integer.parseInt(st.nextToken());

            score_arr = new int[st_arr[0]];
            st = new StringTokenizer(br.readLine());

            for(int i = 0; i < st_arr[0]; i++){
                score_arr[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(score_arr);

            System.out.println(score_arr[st_arr[0]-st_arr[1]]);
        }catch(IOException e){

        }
        
        
        
    }
}