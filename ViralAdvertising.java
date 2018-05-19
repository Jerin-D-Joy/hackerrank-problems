package www.hackerrank.com;

import java.util.Scanner;

public class ViralAdvertising {

    static int viralAdvertising(int n) {
        int recipients = 5;
        int likes = 0;
        for (int i = 1; i <= n; i++) {
            likes+=recipients/2;
            recipients = (recipients / 2) * 3;
        }
        return likes;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = viralAdvertising(n);
        System.out.println(result);
        in.close();
    }
}