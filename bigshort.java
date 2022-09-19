import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bigshort {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int big = -1000000;
        int small = 1000000;
        
        while(st.hasMoreTokens()){
            int num = Integer.parseInt(st.nextToken());
            
            if(num > big){
                big = num;
            }
            if(num < small){
                small = num;
            }
        }

        System.out.println(small+" "+big);
    }
}
