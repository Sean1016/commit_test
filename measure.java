import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class measure {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int count = 0, answer = -1;
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for(int i = 1; i <= N; i++){
            if(N % i == 0){
                count++;
                if(count == K){
                    answer = i;
                }
            }
        }

        if(answer == -1){
            System.out.println(0);
        }else{
            System.out.println(answer);
        }

    }
}
