import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import org.xml.sax.InputSource;

public class money {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long A_money = Integer.parseInt(st.nextToken());
        long B_money = Integer.parseInt(st.nextToken());
        long C_money = Integer.parseInt(st.nextToken());
        long x = 1;

        if(B_money >= C_money){
            x = -1;
            System.out.println(x);
        }else{
            while(C_money * x <= (B_money * x) + A_money){
                x++;
            }
    
            System.out.println(x);
        }
    }
}
