import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class sign {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int tc = 0; tc <= 2; tc++){
            BigInteger check = new BigInteger("0");
            BigInteger num_sum = new BigInteger("0");
            int tc_num = Integer.parseInt(br.readLine());
            for(int i = 0; i < tc_num; i++){
                BigInteger num = new BigInteger(br.readLine());
                num_sum = num_sum.add(num);
            }

            if(num_sum.compareTo(check) == 0){
                System.out.println("0\n");
            }else if(num_sum.compareTo(check) == -1){
                System.out.println("-\n");
            }else
                System.out.println("+\n");
            }
        }
}
