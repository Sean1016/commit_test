import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class oven_clock {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        int cook_time = Integer.parseInt(br.readLine());
        int sum_min = 0;
        //cook_time이 60을 넘는지
        if(cook_time >= 60){
            hour += (cook_time / 60);
            cook_time = (cook_time % 60);
        }
        //60을 넘지 않는 경우
        if(minute + cook_time < 60){
             sum_min = minute + cook_time;
             if(hour >= 24){
                hour -= 24;
            }
            System.out.println(hour+" "+sum_min);
        }

        //60을 넘는 경우
        if(minute + cook_time >= 60){
            sum_min = minute + cook_time -60;
            ++hour;
            if(hour >= 24){
                hour -= 24;
            }
            System.out.println(hour+" "+sum_min);
        }
    }
}
