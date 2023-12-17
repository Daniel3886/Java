import javax.swing.JOptionPane;
import java.util.Random;

public class Zad4 {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1; 
        int liczbaProb = 7;

        JOptionPane.showMessageDialog(null, "Witaj w grze 'Zgadnij dowolną wartość kolegi'!\n" +
                "Zgadnij jego liczbę w przedziale od 1 do 100. Masz 7 szans.");

        while (liczbaProb > 0) {
            String odpowiedz = JOptionPane.showInputDialog("Zgadnij liczbę:");
            try {
                int guessedNumber = Integer.parseInt(odpowiedz);
                if (guessedNumber == numberToGuess) {
                    JOptionPane.showMessageDialog(null, "Gratulacje! Zgadłeś liczbę: " + numberToGuess);
                    break;
                } else if (guessedNumber < numberToGuess) {
                    JOptionPane.showMessageDialog(null, "Podana liczba jest za mała. Spróbuj większej liczby.");
                } else {
                    JOptionPane.showMessageDialog(null, "Podana liczba jest za duża. Spróbuj mniejszej liczby.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Błąd! Wprowadź poprawną liczbę.");
            }

            liczbaProb--;

            if (liczbaProb == 0) {
                JOptionPane.showMessageDialog(null, "Niestety, nie udało ci się odgadnąć liczby. Liczba to: " + numberToGuess);
            }
        }
    }
}


//zadanie4(chetny).java
