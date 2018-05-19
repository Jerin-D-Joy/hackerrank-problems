package www.hackerrank.com;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLargeFactorials {

    static void extraLongFactorials(int n) {
        BigInteger factorial = new BigInteger("1");
        for(int i = 1; i<=n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.print(factorial);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        extraLongFactorials(n);
        in.close();
    }
}
