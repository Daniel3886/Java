public class zad6 {
    public static void main(String[] args) {
        String miasto = "warsawa";
        int stringLength = miasto.length();
        String upperCity = miasto.toUpperCase();
        String lowerCity = miasto.toLowerCase();

        System.out.println(" Miasto: " + miasto);
        System.out.println("Dlugosc lancucha: " + stringLength);
        System.out.println(" Wielkie litery: " + upperCity);
        System.out.println(" Male litery: " + lowerCity);
    }
}
