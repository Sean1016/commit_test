import java.util.Scanner;

public class apart {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        int floor = 0, ho = 0;
        int p_array[] = new int[test_case];
        for(int i = 0; i < test_case; i++){
            floor = sc.nextInt();
            ho = sc.nextInt();
            int sum = floor + ho;

            p_array[i] = sum * (sum-1) / 2;
        }

        for(int i = 0; i < test_case; i++){
            System.out.println(p_array[i]);
        }
    }
}
