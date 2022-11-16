import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class call_money {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc_num = Integer.parseInt(br.readLine());
        //int[] arr = new int[tc_num];
        int num = 0, young = 0, min = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        while(st.hasMoreTokens()){
            int m = 0, y = 0;
            //arr[n] = Integer.parseInt(st.nextToken());
            num = Integer.parseInt(st.nextToken());
            if(num % 30 <= 29 && num % 30 >= 0){
                y++;
            }
            if(num % 60 <= 59 && num % 60 >= 0){
                m++;
            }
            
            young += 10 * (y+(num / 30));
            min += 15 * (m+(num / 60));
        }

        if(young == min){
            System.out.println("Y M "+young);
        }else if(young > min){
            System.out.println("M "+min);
        }else{
            System.out.println("Y "+young);
        }


    }
}
