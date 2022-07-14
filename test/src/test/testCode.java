package test;

public class testCode {

	static void display(int num,String...values) {
		for(String s:values) {
			System.out.println(num+s);
		}
	}
		public static void main (String[] args) {
			display(1000, "My","name","id");
		}
			
		}

