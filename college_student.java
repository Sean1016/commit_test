import java.io.*;
import java.util.StringTokenizer;

public class college_student{
    public static void main(String[] args) throws IOException{
        int tc_num, st_num, temp = 0;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        tc_num = Integer.parseInt(br.readLine());
        
        for(int tc = 0; tc < tc_num; tc++){
            double avg = 0.0;
            int sum = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            st_num = Integer.parseInt(st.nextToken());
            int[] array = new int[st_num];
            int i = 0; 
            double over = 0;

            while(st.hasMoreTokens()){
                temp = Integer.parseInt(st.nextToken());
                sum += temp;
                array[i] = temp;
                ++i;
            }

            avg = sum / st_num;
            
            for(int j = 0; j < array.length; j++){
                if(array[j] > avg){
                    ++over;
                }
            }
            double result = over / st_num * 100;
            System.out.println(String.format("%.3f", result)+"%");
        }

    }
}