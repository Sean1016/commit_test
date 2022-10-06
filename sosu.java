import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class sosu{
    public static boolean isPrime(int num){
        if(num == 1){
            return false;
        }

        for(int i=2; i<num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException{
        int i = 0, sum = 0;
        int int_arr[];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int tc_num = Integer.parseInt(br.readLine());
        int_arr = new int[tc_num];
        StringTokenizer st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()){
            int_arr[i] = Integer.parseInt(st.nextToken());
            i++;
        }

        for(i = 0; i < int_arr.length; i++){
            if(isPrime(int_arr[i])){
                sum++;
            }
        }

        System.out.println(sum);

    }
}