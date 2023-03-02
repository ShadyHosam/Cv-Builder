import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;

public class PrintSkillsSection extends Parent {
    public static void saveInfo() {

        try {
            FileWriter fw = new FileWriter(path, true);
            PrintWriter pw = new PrintWriter(fw);
            pw.append("Skills\n");
            for (Vector<String> skill : skillsVector) {
                int cnt = 0;
                for (String current : skill) {
                    pw.append(current);
                    if (cnt == 0) pw.append(": ");
                    cnt++;
                }
                if (skill.size() > 1) pw.append("\n");
            }
            pw.close();
        } catch (IOException e) {
            System.out.println("WRONG PATH");
        }
    }

}
