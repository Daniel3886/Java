import java.util.Scanner;

 

public class zad5 {
    public static void main(String[] args) {
        String[] options = { "+", "-", "*", "/" };
         Scanner scanner = new Scanner(System.in);

      
        System.out.println("Wybierz operację matematyczną (+, -, *, /): ");
         String selectedOption = scanner.next();

        if (selectedOption.equals("+") || selectedOption.equals("-") || selectedOption.equals("*") || selectedOption.equals("/")) {
    System.out.println ("Podaj pierwszą liczbę: ");
    int a = scanner.nextInt();

    System.out.println ("Podaj drugą liczbę: ");
    int b = scanner.nextInt();

    int result;
    switch(selectedOption){
         case "+":
            result = a + b;
            System.out.println (+a+ "+" +b+ "=" + result);
            break;
          case "-":
            result = a - b;
           System.out.println ( +a+ "-"  +b+  "=" +result);
            break;
           case "*":
            result = a * b;
            System.out.println (+a+ "*" +b+ "=" + +result);
            break;
          case "/":
            result = a / b;
            System.out.println (+a+ "/" +b+ "=" +result);
            break;        
    }
 }

    }}