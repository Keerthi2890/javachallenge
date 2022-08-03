package javachallenge;

public class Palindrome {
	
	public static boolean palindromeCheck(String str,String rev)
	{
			String s=str.replaceAll("[\\W]+", "").toLowerCase();
			boolean pal = false;
			for(int i=s.length()-1; i>=0;i--)
			{
				rev=rev + s.charAt(i);
			}
			if (s.equalsIgnoreCase(rev)) {
		        pal = true;
		    }
			System.out.println(pal);
			return pal;
			
	}
	public static void main(String[] args) {
		String str="A man, a plan, a canal: Panama";
		String rev="";
		palindromeCheck(str,rev);
		
		
	}
}