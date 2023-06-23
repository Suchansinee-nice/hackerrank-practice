package project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubCompare {
	
	//https://www.hackerrank.com/challenges/java-string-compare/problem

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string : ");
        String s = scan.next();
        System.out.println("Enter int : ");
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
    
    public static String getSmallestAndLargest(String s, int k) {
           String smallest = "";
            String largest = "";
            int sublength = k;
            
            List<String> sub = new ArrayList<String>();
            for(int i =0;i<s.length();i++) {
                if(s.length() - i >= sublength) {
                    sub.add(s.substring(i, k));
                    k++;
                }
                
            }
            
            String max = sub.get(0);
            for(int x=0;x<sub.size()-1;x++) {
                if(max.compareTo(sub.get(x+1)) < 0) {
                    max = sub.get(x+1);
                }
            }
            largest = max;
            
            String min = sub.get(0);
            for(int x=0;x<sub.size()-1;x++) {
                if(min.compareTo(sub.get(x+1)) > 0) {
                    min = sub.get(x+1);
                }
            }
            smallest = min;
        return smallest + "\n" + largest;
    }

}
