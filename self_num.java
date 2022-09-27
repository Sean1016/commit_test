public class self_num{
    public static int solution(int n){
        int sum = n;

        while(true){
            if(n == 0){
                break;
            }
            sum += n % 10;
            n = n / 10;
        }

        return sum;

    }
    public static void main(String[] args){
        boolean[] answer_arr = new boolean[10001];

        for(int i = 1; i <= 10000; i++){
            int sol = solution(i);

            if(sol <= 10000){
                answer_arr[sol] = true;
            }
        }

        for(int i = 1; i < 10000; i++){
            if(!answer_arr[i]){
                System.out.println(i);
            }
        }
    }
}