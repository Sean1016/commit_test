import java.math.BigInteger;
import java.util.Scanner;

public class rice2 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        BigInteger money = sc.nextBigInteger();
        BigInteger aline = sc.nextBigInteger();

        System.out.println(money.divide(aline));
        System.out.println(money.remainder(aline));
    }
}
