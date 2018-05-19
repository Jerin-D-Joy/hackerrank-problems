package www.hackerrank.com;

import java.util.Scanner;

public class FindingDigits {

    static int findDigits(int n) {
        int divisors = 0;
        int div;
        while (n != 0) {
            div = n % 10;
            if (div != 0 && n % div == 0) {
                ++divisors;
            }
            n = n / 10;
        }
        return divisors;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            int result = findDigits(n);
            System.out.println(result);
        }
        in.close();
    }

}
