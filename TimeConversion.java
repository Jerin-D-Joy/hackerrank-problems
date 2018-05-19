package www.hackerrank.com;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeConversion {

    static String timeConversion(String s) {
        String hour = s.substring(0,2);
        String time = s.substring(2, s.length()-2);
        int hourInt = 0;
        if(s.endsWith("PM") && !hour.equals("12")) {
            hourInt =  Integer.parseInt(hour) + 12;
            hour = String.valueOf(hourInt);
            if(hourInt == 24)
                hour = "00";
        } else if(s.endsWith("AM")){  //AM
            if(hour.equals("12"))
                hour = "00";
        }
        return hour + time;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}

