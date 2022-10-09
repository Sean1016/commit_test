import java.util.Scanner;

public class honeycomb{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tc_num = sc.nextInt();
        int count = 1;
		int range = 2;

        if(tc_num == 1){
            System.out.println(1);
        }else{
            while (range <= tc_num) {
				range = range + (6 * count);
				count++;
			}
			System.out.print(count);
        }
    }
}