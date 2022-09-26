import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class chess{
    public static void main(String[] ags){
        int[] piece_arr = {1,1,2,2,2,8};
        int[] answer_arr = new int[6];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] new_piece = new int[6]; 
            int i = 0;
            while(st.hasMoreTokens()){
                new_piece[i] = Integer.parseInt(st.nextToken());
                ++i;
            }

            for(int j = 0; j < piece_arr.length; j++){
                answer_arr[j] = piece_arr[j] - new_piece[j];
            }
        }catch(IOException e){
            
        }

        for(int j = 0; j < answer_arr.length; j++){
            System.out.print(answer_arr[j]+" ");
        }
    
    }
}