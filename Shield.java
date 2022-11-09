import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Shield {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int shield = Integer.parseInt(st.nextToken());
        float user = Integer.parseInt(st.nextToken());

        int result = (int)(shield - (shield * (user / 100)));

        if(result >= 100){
            System.out.println(0);
        }else{
            System.out.println(1);
        }
        
    }
}
