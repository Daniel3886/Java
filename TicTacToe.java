import java.util.*;

public class TicTacToe {

    static String[] board;
    static String turn;
    static String userSymbol;
    static String computerSymbol;

    static Scanner scanner = new Scanner(System.in);

    static void initializeGame() {
        board = new String[9];
        turn = "user";
        userSymbol = "";
        computerSymbol = "";
    }

    static void chooseSymbol() {
        System.out.println("Choose your symbol (X or O): ");
        userSymbol = scanner.nextLine().toUpperCase();
        computerSymbol = (userSymbol.equals("X")) ? "O" : "X";
    }

    static String checkWinner() {
        for (int a = 0; a < 8; a++) {
            String line = "";
            switch (a) {
                case 0:
                    line = board[0] + board[1] + board[2];
                    break;
                case 1:
                    line = board[3] + board[4] + board[5];
                    break;
                case 2:
                    line = board[6] + board[7] + board[8];
                    break;
                case 3:
                    line = board[0] + board[3] + board[6];
                    break;
                case 4:
                    line = board[1] + board[4] + board[7];
                    break;
                case 5:
                    line = board[2] + board[5] + board[8];
                    break;
                case 6:
                    line = board[0] + board[4] + board[8];
                    break;
                case 7:
                    line = board[2] + board[4] + board[6];
                    break;
            }
            if (line.equals(userSymbol.repeat(3))) {
                return "user";
            } else if (line.equals(computerSymbol.repeat(3))) {
                return "computer";
            }
        }

        for (int a = 0; a < 9; a++) {
            if (Arrays.asList(board).contains(String.valueOf(a + 1))) {
                break;
            } else if (a == 8) {
                return "draw";
            }
        }
        return null;
    }

    static void printBoard() {
        System.out.println("|---|---|---|");
        System.out.println("| " + board[0] + " | "
                + board[1] + " | " + board[2]
                + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[3] + " | "
                + board[4] + " | " + board[5]
                + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[6] + " | "
                + board[7] + " | " + board[8]
                + " |");
        System.out.println("|---|---|---|");
    }

    static void switchTurn() {
        turn = (turn.equals("user")) ? "computer" : "user";
    }

    static void userMove() {
        System.out.println("Enter a slot number to place " + userSymbol + " in:");
        int numInput = scanner.nextInt();

        if (!(numInput > 0 && numInput <= 9)) {
            System.out.println("Invalid input; re-enter slot number:");
            userMove();
            return;
        }

        if (board[numInput - 1].equals(String.valueOf(numInput))) {
            board[numInput - 1] = userSymbol;
            switchTurn();
        } else {
            System.out.println("Slot already taken; re-enter slot number:");
            userMove();
        }
    }

    static boolean isValidMove(int choice) {
        return board[choice - 1].equals(String.valueOf(choice));
    }

    static void computerMove() {
        System.out.println("Computer's turn:");

        int computerChoice;
        do {
            computerChoice = (int) (Math.random() * 9) + 1;
        } while (!isValidMove(computerChoice));

        board[computerChoice - 1] = computerSymbol;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        board = new String[9];
        initializeGame();
        chooseSymbol();
        String winner = null;
    
        for (int a = 0; a < 9; a++) {
            board[a] = String.valueOf(a + 1);
        }
    
        System.out.println("Welcome to 3x3 Tic Tac Toe. You'll be facing against the computer. Good Luck!");
        printBoard();
    
        while (winner == null) {
            if (turn.equals("user")) {
                userMove();
            } else {
                computerMove();
                switchTurn();  
            }
        
            printBoard();
            winner = checkWinner();
        
            if (winner != null && !winner.equals("draw")) {
                System.out.println("Congratulations! " + winner + " has won! Thanks for playing.");
                break;
            } else if (winner != null && winner.equals("draw")) {
                System.out.println("It's a draw! Thanks for playing.");
                break;
            }
        }}}
    