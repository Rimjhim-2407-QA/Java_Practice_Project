package javaPackagepractice;

public class PalindromeString {

	public static void main(String[] args) {
		String str1 = "Madam";
	      String str2 = "";

	      for(int i = str1.length()-1; i>=0; i--)
	      {
	        str2 += str1.charAt(i);
	      }
	      System.out.println("Reversed String :" +str2);

	      if (str1.equalsIgnoreCase(str2))
	      {
	        System.out.println("String is palindrome");
	      
	      }
	      else{
	        System.out.println("String is not palindrome");
	      }
	      
	}
}