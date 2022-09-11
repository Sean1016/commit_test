import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {
    public static int Fibonacci_num(int tc_num){
        if (tc_num == 0)	return 0;
        if (tc_num == 1)	return 1;
        return Fibonacci_num(tc_num - 1) + Fibonacci_num(tc_num - 2);   
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc_num = Integer.parseInt(br.readLine());

        int cnum = Fibonacci_num(tc_num);
        System.out.println(cnum);
        
    }
 }
