import javax.swing.JOptionPane;

public class zad1
{
	public static void main(String[] args)
	{	
		String pelno = "nie pelnoletni";
		String input1 = JOptionPane.showInputDialog("podaj imie: ");
		String input2 = JOptionPane.showInputDialog("podaj wiek: ");
		int year = Integer.parseInt(input2);
		if(year > 17)
		pelno = "pelnoletni";
		JOptionPane.showMessageDialog(null, "Masz na imie: " +input1+ " i jestes pelnoletnia osoba: " +year+ ".");
	}
}