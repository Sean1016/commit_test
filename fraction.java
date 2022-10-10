import java.util.Scanner;

public class fraction {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 0, count = 0, top = 0, bot = 0;

        if(num == 1) {
			System.out.println("1/1");
        }else{
            while(count < num){
                i++;
                count = i * (i + 1)/2;
            }

            int j = num-(i-1) * i/2;

            if(i % 2 == 0){
                top = j;
                bot = i - j + 1;
            }else{
                top = i - j + 1;
                bot = j;
            }
            System.out.println(top+"/"+bot);
        }    

    }
}
