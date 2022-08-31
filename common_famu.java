import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class common_famu{
    public static int GCF(int num1, int num2){ //최대공약수
        int small = 0;

        if(num1 > num2 ){
            small = num2;
        }else{
            small = num1;
        }

        for(int i = small; i > 0; i--){
            if(num1 % i == 0 && num2 % i == 0){
                return i;
            }
        }
        return -1;  
    }

    public static int LCM(int num1, int num2){ //최소공배수
        int i = GCF(num1, num2);

        int sum = (num1/i) * (num2/i) * i;
        return sum;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num1 = 0;
        int num2 = 0;

        while(st.hasMoreTokens()){
            num1 = Integer.parseInt(st.nextToken());
            num2 = Integer.parseInt(st.nextToken());
        }

        System.out.println(GCF(num1, num2));
        System.out.println(LCM(num1, num2));

    }
}