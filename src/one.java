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
		
		System.out.println("”¼Œa" + x + "‚Ì‰~‚Ì–ÊÏ‚Í" + (PI * x * x) + "‚Å‚·");
		System.out.print("®”a‚Ì’l: ");
		a = stdIn.nextInt();
		System.out.println("a / 2 = " + a/2);
		System.out.println("a % 2 = " + a%2);
		
		String s = "ABC";
		System.out.println("•¶š—ñs‚Í" + s);
	}

}
