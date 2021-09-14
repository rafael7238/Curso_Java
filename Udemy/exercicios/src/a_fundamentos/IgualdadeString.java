package a_fundamentos;

public class IgualdadeString {

	public static void main(String[] args) {
		
		System.out.println("2"=="2"); //True
		String s = new String("2");
		System.out.println("2"==s); //false
		System.out.println("2".equals(s)); //true

	}

}
