package www.hackerrank.com;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ProgrammerDay {

    static String solve(int year){
        int daysTillAugtExFeb = 215;
        int days = 28;
        int pd = 256;
        if(isLeapYear(year))
            days = 29;
        else if(year == 1918)
            days = 15;
        int diff = pd - (daysTillAugtExFeb + days);
        return String.valueOf(diff) + ".09." +String.valueOf(year);

    }

    private static boolean isLeapYear(int year) {
        if(year >= 1700 && year <= 1917) { //julian calender /4
            if(year%4 == 0)
                return true;
        } else if( year >= 1918 && year <= 2700) {//gregorian
           if(year%400 == 0 || (year%100!=0 && year%4 == 0))
               return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }
}
