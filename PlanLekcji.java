import java.util.Scanner;

public class Timetable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Assuming you have a list of teachers
        String[] teachers = {"Nowak", "Ignaczewska", "Jaskowiak"};

        // 5 days and 6 periods per day
        String[][] timetable = new String[5][6];

        for (int day = 0; day < 5; day++) {
            for (int period = 0; period < 6; period++) {
                timetable[day][period] = "Klasa " + (day * 10 + period + 10);
            }
        }

        System.out.println("Podaj jakiego nauczyciela plan lekcji chcesz zobaczyc?");
String selectedTeacher = scanner.nextLine().toLowerCase(); // Convert to lowercase

// Check if the selected teacher exists (case-insensitive)
boolean teacherExists = false;
for (String teacher : teachers) {
    if (teacher.toLowerCase().equals(selectedTeacher) || teacher.toUpperCase().equals(selectedTeacher)) {
        teacherExists = true;
        break;
    }
}

       // boolean teacherExists = false;
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
                    System.out.println("Lekcja " + (period + 1) + ": " + timetable[selectedDay - 1][period]);

                    
                }
            }
        }
    }
}