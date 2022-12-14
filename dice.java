import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class dice{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A,B,C;

        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        if(A == B && A == C){
            System.out.println((10000 + ( A * 1000)));
        }else if(A == B){
            System.out.println((1000 + (A * 100)));
        }else if(A == C){
            System.out.println((1000 + (A * 100)));
        }else if(B == C){
            System.out.println((1000 + (B * 100)));
        }else{
            int temp = Math.max(A, B);
            int max = Math.max(temp, C);
            System.out.println(max * 100);
        }
    }
}