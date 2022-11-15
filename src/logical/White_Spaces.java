package logical;

public class White_Spaces {
	public static void main(String[] args) {
		String s="R U T U J A";
		int count=0;
		for(int i=0;i<=s.length()-1;i++) {
			char x=s.charAt(i);
			if(x==' ') {
				count++;
			}
		}
			System.out.println(count);
		
	}

}
