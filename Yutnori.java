import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Yutnori {
    public static void main(String[] args) throws IOException{
        String[] answer = new String[3];
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int j = 0; j < 3; j++){
            int count = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                if(Integer.parseInt(st.nextToken()) == 0){
                    count++;
                }
            }
            if(count == 1){
                answer[j] = "A";
            }else if(count == 2){
                answer[j] = "B";
            }else if(count == 3){
                answer[j] = "C";
            }else if(count == 4){
                answer[j] = "D";
            }else{
                answer[j] = "E";
            }
        }

        for(int k = 0; k < answer.length; k++){
            System.out.println(answer[k]);
        }
    }
}
