package epam.view;

public class Printer {
    private static Printer printer = null;

    private Printer() {
    }

    public static Printer getPrinter() {
        if (printer == null) {
            printer = new Printer();
        }
        return printer;
    }

    public void execute(Object message) {
        System.out.println(message);
    }
}
