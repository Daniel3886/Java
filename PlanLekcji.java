import java.util.Scanner;

public class Timetable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] teachers = {"Nowak", "Ignaczewska", "Jaskowiak"};

        // 5 days and 6 periods per day
        String[][] timetable = {
            {"Nr  Godz", "Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek"},
            {"1. 7:45-8:30", "", "Matematyka", "Matematyka", "Informatyka", "Witriny i Apl."},
            {"2. 8:40-9:25", "Historia", "Historia", "Matematyka", "Informatyka", "Bazy danych"},
            {"3. 9:35-10:20", "Chemia", "Chemia", "Wychowanie", "Witriny i Apl.", "Bazy danych"},
            {"4. 10:35-11:20", "Prog. Obiekt", "Polski", "Polski", "Witriny i Apl.", "Bazy danych"},
            {"5. 11:30-12:15", "Angielski", "Polski", "Niemicki", "Geografia", "WF"},
            {"6. 12:25-13:10", "WF", "Wychowanie", "Niemicki", "", "WF"},
            {"7. 13:20-14:05", "Prog. Obiekt", "Matematyka", "Informatyka", "", "HIT"},
            {"8. 14:10-14:55", "Prog. Obiekt", "Przedsie.", "", "", "Geografia"},
            {"9. 15:00-15:45", "Prog. Obiekt", "Witriny i Apl.", "", "", "Angielski"},
        };

       // for (int day = 0; day < 5; day++) {
           // for (int period = 0; period < 6; period++) {
//timetable[day][period] = "Klasa " + (day * 10 + period + 10);
           // }
       // }

System.out.println("Podaj jakiego nauczyciela plan lekcji chcesz zobaczyc?");
String selectedTeacher = scanner.nextLine().toLowerCase();

boolean teacherExists = false;
for (String teacher : teachers) {
    if (teacher.toLowerCase().equals(selectedTeacher) || teacher.toUpperCase().equals(selectedTeacher)) {
        teacherExists = true;
        break;
    }
}
        for (String teacher : teachers) {
            if (teacher.equals(selectedTeacher)) {
                teacherExists = true;
                break;
            }
        }

        if (!teacherExists) {
            System.out.println("Błąd! Nauczyciel nie istnieje. Spróbuj ponownie.");
        } else {
            System.out.println("Podaj jaki dzień tygodnia chcesz zobaczyc? (1-5)");
            int selectedDay = scanner.nextInt();

            // Validate the selected day
            if (selectedDay < 1 || selectedDay > 5) {
                System.out.println("Błąd! Niepoprawny dzień tygodnia. Spróbuj ponownie.");
            } else {
                // Display the timetable for the selected teacher and day
                System.out.println("Plan lekcji dla " + selectedTeacher + " w dzień " + selectedDay + ":");
                System.out.println("-------------------------------");
                for (int period = 0; period < 9; period++) {
                    System.out.println("Lekcja " + (period + 1) + ": " + timetable[selectedDay][period]);

                    
                }
            }
        }
    }
}
