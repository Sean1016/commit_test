import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class doorlock {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        for(int i = 0; i < tc; i++){
            String sent = br.readLine();
            if((sent.length() >= 6) && (sent.length() <= 9)){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }
}
