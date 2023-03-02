import java.util.Scanner;
import java.util.Vector;

public class ManageAllVariables {
    Scanner scan = new Scanner(System.in);
    static MainMenu showMain = new MainMenu();
    static PrintOnConsoleOnly Print = new PrintOnConsoleOnly();
    SavingChecker isSaved = new SavingChecker();
    public static boolean[] allSections = new boolean[2];
    public static String[] validInformation = new String[5];
    public static String[] tempEducation = new String[5];
    public static String[] educationAfterSaving = new String[5];
    public static String summaryInfo;
    public static String path = "";
    public static String fromYear;
    static Vector<Vector<String>> workVector = new Vector<Vector<String>>();
    static Vector<Vector<String>> skillsVector = new Vector<Vector<String>>();
}
