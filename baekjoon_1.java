import java.util.Scanner;

public class baekjoon_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        int arr[] = new int[test_case];

        for(int i = 0; i < test_case; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    int temp = 0;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
