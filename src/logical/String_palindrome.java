package logical;

public class String_palindrome {
	public static void main(String[] args) {
		String name="nitin";
		String rev="";
		for(int i=name.length()-1;i>=0;i--) {
			rev=rev+name.charAt(i);
		}
			if(name.equals(rev)) {
				System.out.println("palindrome");
			}
			else {
				System.out.println("not palindrome");
			}
		}
	}


