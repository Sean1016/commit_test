import java.util.Arrays;
import java.util.Scanner;

public class baekjoon2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        int[] arr = new int[tc];

        for(int i = 0; i < tc; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}