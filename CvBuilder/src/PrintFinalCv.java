import java.io.*;
import java.io.IOException;
public class PrintFinalCv extends Parent {
    String check;
    public void StartSaving() {
        System.out.println("1. Path: ");
        path = scan.nextLine();
        try {
            FileWriter testfile = new FileWriter(path, true);
        } catch (IOException e) {
            System.out.println("Enter Valid Path!");
            showMain.displayMenu();
        }
        Print.printSave();
        check = scan.nextLine();
        int okay = isSaved.checkIsYesOrNo(check);
        if (okay == 1) {
            setSavingCv();
            showMain.displayMenu();
        } else
            showMain.displayMenu();
    }
    private void setSavingCv() {
        try {
            FileWriter fw = new FileWriter(path, true);
            PrintWriter pw = new PrintWriter(fw);
            PrintInformationSection.saveInfo();
            PrintSummarySection.saveInfo();
            PrintWorkExperienceSection.saveInfo();
            PrintEduSection.saveInfoEdu();
            PrintSkillsSection.saveInfo();
            pw.close();
        } catch (IOException e) {
            System.out.println("Sorry Mate ! WRONG PATH");
        }
    }
}
