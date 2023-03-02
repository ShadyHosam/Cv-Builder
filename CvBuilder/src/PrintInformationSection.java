import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintInformationSection extends Parent {
    public static void saveInfo() {
        try {
            FileWriter fw = new FileWriter(path, true);
            PrintWriter pw = new PrintWriter(fw);
            for (int i = 0; i < validInformation.length; i++) {
                pw.append(validInformation[i]);
                if (i == 0 || i == 1) pw.append("\n");
                else pw.append("\t\t");
            }
            pw.append("\n");
            pw.append(Print.printBreakLine());
            pw.close();
        } catch (IOException e) {
            System.out.println("WRONG PATH");
        }


    }
}
