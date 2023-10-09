import javax.swing.JOptionPane;
import java.util.Scanner;

public class zad3
{
	public static void main(String[] args)
	{
		double v;
		
		Scanner input = new Scanner(System.in);
		JOptionPane.showMessageDialog(null,"V to liczba sadzone km jakie mozna umiescic w rzedzie");
		 String rInput = JOptionPane.showInputDialog(null, "R =");
        double r = Double.parseDouble(rInput);
		 String eInput = JOptionPane.showInputDialog(null, "R =");
        double e = Double.parseDouble(rInput);
		 String sInput = JOptionPane.showInputDialog(null, "R =");
        double s = Double.parseDouble(rInput);
		JOptionPane.showMessageDialog(null, "V = (R - 2E) / S");
		v = (r - 2*e)/s;
		JOptionPane.showMessageDialog(null, +v+ " = (" +r+ " - " +2*e+ ")/ " +s);
	}
} 