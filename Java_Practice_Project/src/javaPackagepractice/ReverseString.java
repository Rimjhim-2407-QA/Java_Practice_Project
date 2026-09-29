package javaPackagepractice;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "rimjhim";
		String rev = "";
		
		for(int i=s1.length()-1; i>=0; i-- ) {
			 rev +=s1.charAt(i);
		}
		System.out.println("Reversed String: " +rev);
	}

}
