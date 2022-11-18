import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        App app = new App();
        app.app(args);
    }

    public void app(String[] args) {
        if (args == null || args.length == 0) {
            return;
        }
        if ("-help".equals(args[0])) {
            printHelpScreen();
            return;
        }
        // at least two argument must be passed
        if (args.length < 2) {
            System.out.println("Must have at least one input file to merge and one output file...");
            System.out.println("For help type -help");
            return;
        }

        List<String> filenames = new ArrayList<>();
        for (int i = 0; i <= args.length - 2; ++i) {
            System.out.println(args[i]);
            filenames.add(args[i]);
        }
        String output = args[args.length - 1];
        CsvCombiner csvCombiner = new CsvCombiner();
        System.out.println("\tWelcome to CSV Combiner");
        csvCombiner.combine(filenames, output);
    }

    /**
     * print help message
     */
    private static void printHelpScreen() {
        System.out.println("\tWelcome to CSV Combiner");
        System.out.println("Below is the correct format\n");
        System.out.println("\"java App [input filepath One] [input filepath two] [input filepath ...] [output fileName]\"");
    }
}
