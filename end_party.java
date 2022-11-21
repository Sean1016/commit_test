import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class end_party {
    public static int num_ch(int number, int people){
        number = number - people;

        return number;
    }

    public static void main(String[] args) throws IOException{
        int[] array_s = new int[5];
        int tc = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int L = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()){
            if(tc >= 5){
                break;
            }
            array_s[tc] = Integer.parseInt(st.nextToken());

            array_s[tc] = num_ch(array_s[tc], L*P);
            tc++;
        }

        for(int i = 0; i < array_s.length; i++){
            System.out.print(array_s[i]+" ");
        }

        
    }
}
