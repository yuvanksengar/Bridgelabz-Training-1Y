public class NullPointerDemo {
    public static void main(String[] args) {
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Caught in main initially: " + e);
        }
        handleException();
    }

    public static void generateException() {
        String text = null;
        text.length();
    }

    public static void handleException() {
        String text = null;
        try {
            text.length();
        } catch (NullPointerException e) {
            System.out.println("Handled NullPointerException: " + e);
        }
    }
}