package www.hackerrank.com;

import java.util.Scanner;

public class Valley {

    static int countingValleys(int n, String s) {
        int valleys = 0, sealevel = 0;
        char[] charArray = s.toCharArray();
        for(int i=0; i<n; i++) {
            if(charArray[i] == 'U') {
                ++sealevel;
                if(sealevel == 0){
                    ++valleys;
                    continue;
                }
            }
            else --sealevel;
        }
        return valleys;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int result = countingValleys(n, s);
        System.out.println(result);
        in.close();
    }

}
