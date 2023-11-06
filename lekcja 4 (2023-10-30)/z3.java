import javax.swing.JOptionPane;
import java.util.Random;

public class z1 {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(6) + 1; 
		int numberpc = random.nextInt(6) + 1; 
        

        JOptionPane.showMessageDialog(null, "Witaj Symulatorze gry w kości przeciwko komputera! Podaj ilosc prob ktorych chcialbys rzucic");
		int tries = random.nextInt(); 
		
   
        while (tries > 0) {

                    JOptionPane.showMessageDialog(null, "Dostales: " + numberToGuess);
                    JOptionPane.showMessageDialog(null, "Komputer dostalal: " +numberpc);
					
			if( (numberToGuess = 1) || (numberToGuess = 6) || (numberpc=1) || (numberpc=6))
			{
				tries++;
			}
			
            tries--;
        }
			
		if (tries == 0 ){
			JOptionPane.showMessageDialog(null, "Ty zdobyles: " + numberToGuess);
			JOptionPane.showMessageDialog(null, "Komputer dostalal: " + numberpc);
		}
    }
}

