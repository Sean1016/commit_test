import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class candy_teacher{
    public static void main(String[] args) throws IOException{
        BigInteger compare = new BigInteger("0");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());
        String[] str_an = new String[tc];

        for(int i = 0; i < tc; i++){
            BigInteger candy = new BigInteger("0");
            BigInteger N = new BigInteger(br.readLine());
            for(int j = 0; j < N.intValue(); j++){
                BigInteger c = new BigInteger(br.readLine());
                candy = candy.add(c);
            }
            int check = ((candy.mod(N)).compareTo(compare));

            if(check == 0){
                str_an[i] = "YES";
            }else{
                str_an[i] = "NO";
            }
        }

        for(int t = 0; t < str_an.length; t++){
            System.out.println(str_an[t]);
        }

    }
}