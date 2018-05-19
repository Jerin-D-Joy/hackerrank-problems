package www.hackerrank.com;

import java.util.Scanner;

public class NumberReverse {

    static int beautifulDays(int i, int j, int k) {
        int count = 0;
        while(i<=j) {
            int rev = 0;
            int cur = i;
            int x = 0;
            while(cur > 0) {
                rev =  rev*10 + cur%10;
                cur = cur/10;
            }
            if((rev - i)%k == 0) {
                ++count;
            }
            ++i;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();
        int k = in.nextInt();
        int result = beautifulDays(i, j, k);
        System.out.println(result);
        in.close();
    }
}
