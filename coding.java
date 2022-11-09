import java.util.Scanner;

public class coding {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str_s = "";
        if(num % 4 == 0){
            int n = num / 4;
            for(int i = 0; i < n; i++){
                str_s += "long ";
            }

            System.out.println(str_s+"int");
        }
    }
}
