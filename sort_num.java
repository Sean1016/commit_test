import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class sort_num {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[3];
        int i = 0;
        while(st.hasMoreTokens()){
            if(i >= 3){
                break;
            }
            arr[i] = Integer.parseInt(st.nextToken());
            i++;
        }

        Arrays.sort(arr);

        for(int j = 0; j < arr.length; j++){
            System.out.print(arr[j]+" ");
        }
    }
}
