import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class size{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int people_num = Integer.parseInt(br.readLine());

        int people_array[][] = new int[people_num][2];
        int grade_arr[] = new int[people_num];

        for(int i = 0; i < people_num; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            people_array[i][0] = Integer.parseInt(st.nextToken());
            people_array[i][1] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < people_num; i++){
            int grade = 1;
            for(int j = 0; j < people_num; j++){
                if(people_array[i][0] < people_array[j][0] && people_array[i][1] < people_array[j][1]){
                    ++grade;
                }
            }
            grade_arr[i] = grade;
        }

        for(int i = 0; i < people_num; i++){
            System.out.print(grade_arr[i]+" ");
        }
        
    }
}
