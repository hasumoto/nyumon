import java.util.Random;
import java.util.Scanner;

public class one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		int a;
		a=2;
		int b =-1;
		double x=1.5*2;
		final double PI = 3.14;
		
		x = rand.nextDouble();
		
		System.out.println("źa" + x + "Ě~ĚĘĎÍ" + (PI * x * x) + "Ĺˇ");
		System.out.print("ŽaĚl: ");
		a = stdIn.nextInt();
		System.out.println("a / 2 = " + a/2);
		System.out.println("a % 2 = " + a%2);
		
		String s = "ABC";
		System.out.println("śńsÍ" + s);
	}

}
