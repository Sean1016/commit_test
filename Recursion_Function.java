import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Recursion_Function {
    public static int Recursion(int tc_num){
        if(tc_num == 0)
            return 1;
        if(tc_num <= 1)
            return tc_num;
        return tc_num * Recursion(tc_num - 1);
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc_num = Integer.parseInt(br.readLine());
        int sum = 0;
        if(tc_num >= 0 && tc_num <= 12){
            sum = Recursion(tc_num);
        }

        System.out.println(sum);

        
    }  
}
