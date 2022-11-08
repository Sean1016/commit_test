import java.io.BufferedReader;
import java.io.InputStreamReader;

public class safari {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        
        long num1 = Integer.parseInt(str.split(" ")[0]);
        long num2 = Integer.parseInt(str.split(" ")[1]);

        long sum = num1 - num2;
        if(sum < 0 ){
            System.out.println(sum*-1);
        }else{
            System.out.println(sum);
        }
    }
}
