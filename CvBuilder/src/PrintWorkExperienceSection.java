import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWorkExperienceSection extends Parent {

    public static void saveInfo() {
        try {
            FileWriter fw = new FileWriter(path, true);
            PrintWriter pw = new PrintWriter(fw);
            pw.append("Work Experience\n");
            for (int i = 0; i < workVector.size(); i++) {
                for (int j = 0; j < workVector.get(i).size(); j++) {
                    String current = workVector.get(i).get(j);
                    if (j == 0)
                        pw.append(current);
                    if (j == 1) {
                        pw.append(" at ");
                        pw.append(current);
                        pw.append("\t");
                    }
                    if (j == 2) {
                        pw.append(current);
                        pw.append(" to ");
                    }
                    if (j == 3) {
                        pw.append(current);
                        pw.append("\n");
                    } else if (j > 3) {
                        pw.append("-");
                        pw.append(current);
                        pw.append(".\n");
                    }
                }
                if (i != workVector.size() - 1)
                    pw.append("--\n");
            }


            pw.append(Print.printBreakLine());
            pw.close();
        } catch (
                IOException e) {
            System.out.println("WRONG PATH");
        }
    }
}
