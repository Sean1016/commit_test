import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class find_sosu{
    public static int isPrime(int num){
        int i = 2;
        for(i = 2; i < num; i++){
            if(num % i == 0) {
                return 0;
            }
        }
        return i;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int min = Integer.parseInt(st.nextToken());
        int max = Integer.parseInt(st.nextToken());

        for(int i = min; i <= max; i++){
            if(isPrime(i) != 0){
                System.out.println(i);
            }
        }
    }
}