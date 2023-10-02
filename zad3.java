import javax.swing.JOptionPane;
import java.util.Scanner;

public class zad3
{
	public static void main(String[] args)
	{
		double v, r, e, s;
		
		Scanner input = new Scanner(System.in);
		System.out.println(Integer.parseInt("V to liczba sadzone km jakie mozna umiescic w rzedzie"));
		System.out.println(Integer.parseInt("R ="));
		System.out.println(Integer.parseInt("E ="));
		System.out.println(Integer.parseInt("S ="));
		JOptionPane.showMessageDialog(null, "V = (R - 2E) / S");
		v = (r - 2*e)/s;
		JOptionPane.showMessageDialog(null, +v+ " = (" +r+ " - " +2*e+ ")/ " +s+);
	}
}