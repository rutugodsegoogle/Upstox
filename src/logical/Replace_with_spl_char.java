package logical;

import java.util.Scanner;

public class Replace_with_spl_char {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter name");
		String name=s.next();
		/*
		String specialname=name.replace("a", "@");
		System.out.println(specialname);
		*/
		String specialname=name.replaceAll("[^a-zA-Z]", "");
		System.out.println(specialname);
		
	}

}
