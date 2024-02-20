package com.hackerrank.substring;

import java.util.Scanner;

public class SubS {
	
	//https://www.hackerrank.com/challenges/java-substring/problem
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string : ");
        String S = in.next();
        System.out.println("Enter start pos : ");
        int start = in.nextInt();
        System.out.println("Enter end pos : ");
        int end = in.nextInt();
        
      
        String substring = S.substring(start, end);
        System.out.println(substring);

    }

}
