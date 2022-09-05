import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class find_alp{
    public static void main(String[] args){
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int[] answer = {-1, -1, -1, -1, -1, -1,-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,-1, -1};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String Sentence = br.readLine();
            for(int i = 0; i < Sentence.length(); i++){
                char alp = Sentence.charAt(i); //hi
                for(int j = 0; j < alphabet.length; j++){
                    if(alp == alphabet[j] && answer[j] == -1){
                        answer[j] = i;
                        
                    }else{
                        
                    }
                }
            }
        }catch(IOException e1){

        }

        for(int i = 0; i < answer.length; i++){
            System.out.print(answer[i]+" ");
        }
    }
}