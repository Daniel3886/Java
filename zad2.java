import java.util.Scanner;

public class zad2
{
	public static void main(String[] args)
	{
		double v, r, e, s;
		Scanner input = new Scanner(System.in);
		System.out.println("V to liczba sadzone km jakie mozna umiescic w rzedzie");
		System.out.print("R= ");
		r = input.nextDouble();
		System.out.print("E = " );
		e = input.nextDouble();
		System.out.print("S = " );
		s = input.nextDouble();
		System.out.println("V = (R - 2E) / S");
		v = (r - 2*e) / s;
		System.out.println(v + " = (" + r + " - " + 2*e + ") / " + s);
	}
}