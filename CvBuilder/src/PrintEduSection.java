import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintEduSection extends Parent {
    public static void saveInfoEdu() {
        try {
            FileWriter fw = new FileWriter(path, true);
            PrintWriter pw = new PrintWriter(fw);
            pw.append("Education\n");
            pw.append(educationAfterSaving[0] + "\t" + educationAfterSaving[2] + " to " + educationAfterSaving[3] + "\n");
            pw.append(educationAfterSaving[1] + ", " + educationAfterSaving[4] + "\n");
            pw.append(Print.printBreakLine());
            pw.close();
        } catch (IOException e) {
            System.out.println("WRONG PATH");
        }


    }
}
