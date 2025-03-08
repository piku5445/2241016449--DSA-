
public class substring {
    public static void main(String[] args) {
        String str = "Hello, World!";

        // Extracting substring from index 7 to the end
        String substr1 = str.substring(7);
        System.out.println("Substring 1: " + substr1);

        // Extracting substring from index 7 to 12
        String substr2 = str.substring(7, 12);
        System.out.println("Substring 2: " + substr2);

        // Extracting substring from index 0 to 5
        String substr3 = str.substring(0, 5);
        System.out.println("Substring 3: " + substr3);

        // Extracting substring from index 13 (out of bounds)
        // This will throw an IndexOutOfBoundsException
//        String substr4 = str.substring(13); // Uncomment to see the exception

        // Extracting substring from index 5 to 20 (out of bounds)
        // This will throw an IndexOutOfBoundsException
//        String substr5 = str.substring(5, 20); // Uncomment to see the exception
    }
}