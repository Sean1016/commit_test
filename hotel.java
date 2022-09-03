import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class hotel {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc_num = Integer.parseInt(br.readLine());

        for(int tc = 0; tc < tc_num; tc++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            String floor = "";
            String YY = Integer.toString(N % H);
            String height = Integer.toString(H);

            if(YY.equals("0")){
                String XX = Integer.toString((N / H));
                if(XX.length() == 1){
                    floor = height+"0"+XX;
                }else{
                    floor = height+XX;
                }
            }else{
                String XX = Integer.toString((N / H) + 1);
                if(XX.length() == 1){
                    floor = YY+"0"+XX;
                }else{
                    floor = YY+XX;
                }
            }
            System.out.println(Integer.parseInt(floor));
        }
    }
}
