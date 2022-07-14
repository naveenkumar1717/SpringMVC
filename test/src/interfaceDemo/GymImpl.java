package interfaceDemo;

public class GymImpl implements Gym{

	
	public static void main(String[] args) {
		
	}

	@Override
	public void payment(int a) {
		System.out.println("Payment Complete");
		
	}

	@Override
	public void Attendence() {
		System.out.println("Attendence captured");		
	}

	@Override
	public void payment() {
       System.out.println("Done");		
	}

}
