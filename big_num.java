import java.util.Scanner;

public class big_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		String[] n = sc.nextLine().trim().split(" ");
		String a = n[0];
		String b = n[1];
		
		String max = a.length() > b.length() ? a : b;
		String min = a.equals(max) ? b : a;
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < max.length() - min.length() ; i++) {
			sb.append("0");
		}
		min = sb.append(min).toString();
		
		String result = "";
		int ceil = 0;
		for(int i= max.length() - 1 ; i >= 0 ; i-- ) {
			int sum = Character.getNumericValue(max.charAt(i)) + Character.getNumericValue(min.charAt(i));
			result = (sum % 10 + ceil / 10) + result;
			ceil = sum - sum % 10;
		}
		System.out.println((ceil > 0 ? ceil / 10 : "") + result);
    }
}
