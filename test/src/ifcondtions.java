import java.util.Scanner;

public class ifcondtions {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Number:");
		int input=in.nextInt();
		if(input%2==0) 
		   {
			System.out.println("Number is positive");
			}
		else {
			System.out.println("Number is Negative");
		}
		}

}
