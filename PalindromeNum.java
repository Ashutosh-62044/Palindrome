package All_loops;
import java.util.Scanner;
public class PalindromeNum {
public static boolean IsPalindrome(String str) {
	int left=0;
	int right=str.length()-1;
	while(left<right) {
		if(str.charAt(left)!= str.charAt(right)) {
			return false;
		}
		left++;
		right--;
	}
	
	return true;
	}
   public static void main(String[] args) {
		
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter string : ");
	   String str = sc.next();
	   
	  boolean status =  IsPalindrome(str);
	  if(status) {
		  System.out.println("palindrome");
	  }else {
		  System.out.println("not");
	  }
	}

}
