import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ox_quiz {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc_num = Integer.parseInt(br.readLine());
        
        int O_num = 0;
        int sum = 0;

        for(int i=0; i<tc_num; i++){
            String line = br.readLine();
            for(int j=0; j<line.length(); j++){
                char c = line.charAt(j);
                if(c == 'O'){
                    O_num++;
                    sum += O_num;
                }else if(c == 'X'){
                    O_num = 0;
                }
            }
            System.out.println(sum);
            O_num = 0;
            sum = 0;
        }
    }
}
