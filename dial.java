import java.util.Scanner;

public class dial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sec = 0;
        char[] alp = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
        'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        String word = sc.next();
        
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);

            for(int j = 0; j < alp.length; j++){
                if(ch == alp[j]){
                    if(j >= 3 && j <= 5 ){
                        sec += 4;
                    }
                    else if(j >= 6 && j <= 8 ){
                        sec += 5;
                    }
                    else if(j >= 9 && j <= 11 ){
                        sec += 6;
                    }
                    else if(j >= 12 && j <= 14 ){
                        sec += 7;
                    }
                    else if(j >= 15 && j <= 18 ){
                        sec += 8;
                    }
                    else if(j >= 19 && j <= 21 ){
                        sec += 9;
                    }
                    else if(j >= 22 && j <= 25 ){
                        sec += 10;
                    }
                    else{
                        sec += 3;
                    }
                }
            }
        }
        System.out.println(sec);
    }
}