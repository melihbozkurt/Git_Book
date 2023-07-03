public class Main {

    public static String repeatEnd(String str, int n) {
        int length = str.length();
        String lastNChars = str.substring(length - n); // Get the last n characters of the string

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(lastNChars);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(repeatEnd("Hello", 3));  // llollollo
        System.out.println(repeatEnd("Hello", 2));  // lolo
        System.out.println(repeatEnd("Hello", 1));  // o
    }



}