package interfaceDemo;

public class Application {

	public static void main(String[] args) {
		//Creating object for interface using implemented class
		Gym gym=new GymImpl();
		
		gym.payment(2);
		gym.Attendence();
		gym.payment();
     //Creating object for interface using anonymous class   
	Gym gym1=new Gym() {
		
		@Override
		public void payment(int a) {
			System.out.println("Hello master payment completed");
			
		}
		
		@Override
		public void payment() {
			System.out.println("Hello guys");
			
		}
		
		@Override
		public void Attendence() {
			System.out.println("Hy buddies");
			
		}
	};
	gym1.Attendence();
	gym1.payment();
	gym1.payment(3);
	}

}
