import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintSummarySection extends Parent {

    public static void saveInfo() {
        try {
            FileWriter fw = new FileWriter(path, true);
            PrintWriter pw = new PrintWriter(fw);
            if (summaryInfo != null) {
                pw.append(summaryInfo).append("\n");
                pw.append(Print.printBreakLine());
                pw.close();
            }
        } catch (IOException e) {
            System.out.println("WRONG PATH");
        }

    }
}

