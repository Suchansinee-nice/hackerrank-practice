package project;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		
		//A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.
		//Given a string , print Yes if it is a palindrome, print No otherwise.
	        
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Enter string : ");
	        String A= scan.next();
	        int len = A.length();
	        /* Enter your code here. Print output to STDOUT. */
	        String y = "";
	        if(A.length() <= 50){
	            for(int i=len-1;i>=0;i--) {
	                y = y + A.charAt(i);
	            }
	            if(A.equals(y)) {
	                System.out.println("Yes");
	            }else {
	                System.out.println("No");
	            }
	        }
	}

}
