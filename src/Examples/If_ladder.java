package Examples;

public class If_ladder {
	public static void main(String[] args) {
		int age=18;
		if(age>=18)
		{
			System.out.println("You can vote");
		}
		else if(age<=18)
		{
			System.out.println("You are not eligible");
		}
		else
		{
			System.out.println("default");
		}
	}

}
