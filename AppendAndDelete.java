package www.hackerrank.com;

import java.util.Scanner;

public class AppendAndDelete {

    static String appendAndDelete(String s, String t, int k) {
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        return new String();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int k = in.nextInt();
        String result = appendAndDelete(s, t, k);
        System.out.println(result);
        in.close();
    }

}
