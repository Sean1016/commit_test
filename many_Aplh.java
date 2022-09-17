import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class many_Aplh {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input_str = br.readLine();
        String Upper = input_str.toUpperCase(); //대문자 변환
        Character[] chr_arr = {'A','B','C','D','E','F','G','H','I',
        'J','K','L','M','N','O','P','Q','R','S','T','U','W','X','Y','Z'};
        Map<Character, Integer>map = new HashMap<Character, Integer>();

        for(int i = 0; i < Upper.length(); i++){
            Character chr = Upper.charAt(i);
            int sum = 0;
            Character Alphabet = null;
            for(int j = 0; j < chr_arr.length; j++){
                if(chr == chr_arr[j] && map.get(Alphabet) == null){
                    Alphabet = chr;
                    sum++;
                    map.put(Alphabet, sum);
                // }else{
                //     map.put(Alphabet, map.get(Alphabet) + 1);
                }
                System.out.println(map.get(Alphabet));
            }
        }
        System.out.println(map);
        


    }
}
