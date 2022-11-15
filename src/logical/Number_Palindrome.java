package logical;

public class Number_Palindrome {
	public static void main(String[] args) {
		int num=121;
	    int	reversenum=0;
	    int remainder;
	    int org=num;//store the number to original
	    //get the reverse of original & store it in variable
	    while(num!=0) {
	    	remainder=num%10;
	    	reversenum=reversenum*10+remainder;
	    	num=num/10;
	    }
	    if(org==reversenum) {
	    	System.out.println("palindrome");
	    	
	    }
	    else
	    {
	    	System.out.println("Not palindrome");
	    }
	    
		
		
	}

}
