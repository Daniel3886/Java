import javax.swing.JOptionPane;

 

public class zad4 {
    public static void main(String[] args) {
        String[] options = { "+", "-", "*", "/" };
        

        String selectedOption = (String) JOptionPane.showInputDialog(null, "Wybierz  operację matematyczną:",
                "Wybór języka", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        
        // Sprawdź, czy użytkownik coś wybrał
        if (selectedOption != null) {
            JOptionPane.showMessageDialog(null, "Wybrałeś: " + selectedOption);
        } else {
            JOptionPane.showMessageDialog(null, "Nie dokonałeś wyboru.");
        }
        


if (selectedOption == "+" || selectedOption == "-" || selectedOption == "*" || selectedOption == "/") {
    String aInput = JOptionPane.showInputDialog(null, "Podaj pierwszą liczbę: ");
    String bInput = JOptionPane.showInputDialog(null, "Podaj drugą liczbę: ");

    int a = Integer.parseInt(aInput);
    int b = Integer.parseInt(bInput);

    int result;
    switch(selectedOption){
         case "+":
            result = a + b;
            JOptionPane.showMessageDialog(null, +a+ "+" +b+ "=" + result);
            break;
          case "-":
            result = a - b;
            JOptionPane.showMessageDialog(null, +a+ "-"  +b+  "=" +result);
            break;
           case "*":
            result = a * b;
            JOptionPane.showMessageDialog(null, +a+ "*" +b+ "=" + +result);
            break;
          case "/":
            result = a / b;
            JOptionPane.showMessageDialog(null, +a+ "/" +b+ "=" +result);
            break;        
    }
 }

    }}