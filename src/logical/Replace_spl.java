package logical;

public class Replace_spl {
	public static void main(String[] args) {
		String s="Rutuja@Godse$";
		//for(int i=0;i<=s.length()-1;i++) {
		//String cname=s.replace("@","a");
		String cname=s.replaceAll("[^a-zA-Z]", " ");
		
		System.out.println(cname);
		}
	}


