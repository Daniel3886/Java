import java.util.Scanner; // Potrzebne, by móc używać klasy Scanner.
import java.io.*;          // Potrzebne, by móc używać klasy File i wyjątków IOException.

/**
   Ten program wczytuje dane z pliku.
*/

public class FileReadDemo
{
   public static void main(String[] args) throws IOException
   {
      // Tworzenie obiektu klasy Scanner do pobierania danych z klawiatury.
      Scanner keyboard = new Scanner(System.in);

      // Pobieranie nazwy pliku.
     System.out.print("Podaj nazwę pliku: ");
      String filename = keyboard.nextLine();
	  
	File file = new File(filename);
	  
	if(file.exists())
	{
	System.out.print("Ten plik juz istnieje");
	}
	else
	{
	System.out.print("Ten plik nie istnieje i zaraz go dodam");
	PrintWriter plik;
	 plik = new PrintWriter(filename);
	 plik.println("zadanie");
	}
	
      // Otwieranie pliku.
      Scanner inputFile = new Scanner(file);

      // Wczytywanie wierszy z pliku do momentu pobrania wszystkich danych.
      while (inputFile.hasNext())
      {
         // Wczytywanie następnego imienia.
       String friendName = inputFile.nextLine();

       // Wyświetlanie ostatniego wczytanego imienia.
       System.out.println(friendName);
     }

     // Zamykanie pliku.
      inputFile.close();
   }
}