package www.hackerrank.com;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PDFViewer {

    static int designerPdfViewer(int[] h, String word) {
        char[] charArray = word.toCharArray();
        int[] pos = new int[word.length()];
        int i = 0;
        for(char ch : charArray) {
            //96 for lower case and 64 for upper case . pos-1
            pos[i] = h[(int) ch - 97];
            ++i;
        }
        int largest=0;
        for(int element : pos) {
            if(element>largest)
                largest = element;
        }
        return largest*word.length();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i = 0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        int result = designerPdfViewer(h, word);
        System.out.println(result);
        in.close();
    }
}
