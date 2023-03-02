import java.util.Vector;

public class SectionSkills extends Parent {
    public void startSkills() {
        setSkills();
    }
    private void setSkills() {
        Vector<String> CurrentSkills = new Vector<>();

        for (int i = 0; i < 2; i++) {
            Print.printForSkills(i);
            String current = scan.nextLine();
            CurrentSkills.add(current);
        }
        Print.printSave();
        String YesOrNo = scan.nextLine();
        int okay = isSaved.checkIsYesOrNo(YesOrNo);
        if (okay == 1) {
            skillsVector.add(CurrentSkills);
            showMain.displayMenu();
        } else
            showMain.displayMenu();

    }
}
