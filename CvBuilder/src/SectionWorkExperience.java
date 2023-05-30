import java.util.Vector;

public class SectionWorkExperience extends Parent {
    public void workExperienceStart() {
        setWorkExperience();
    }
    private void setWorkExperience() {
        Vector<String> CurrentWork = new Vector<>();
        String CurrentType = "";
        int numberOfParagraphs;
        int checkForValid;
        String yesOrNo;
        for (int i = 0; i < 4; i++) {
            Print.workExp(i);
            CurrentType = scan.nextLine();
            if (i == 0) {
                checkForValid = ValidationForInput.validationForNames(CurrentType);
                while (checkForValid == 0) {
                    Print.printBadInput();
                    CurrentType = scan.nextLine();
                    checkForValid = ValidationForInput.validationForNames(CurrentType);
                }
            }
            if (i == 2) {
                checkForValid = ValidationForInput.validationForDate(CurrentType, 1);
                while (checkForValid == 0) {
                    CurrentType = scan.nextLine();
                    checkForValid = ValidationForInput.validationForDate(CurrentType, 1);
                }
            }
            if (i == 3) {
                checkForValid = ValidationForInput.validationForDate(CurrentType, 2);
                while (checkForValid == 0) {
                    CurrentType = scan.nextLine();
                    checkForValid = ValidationForInput.validationForDate(CurrentType, 2);
                }
            }
            CurrentWork.add(CurrentType);
        }
        Print.paragraph();
        numberOfParagraphs = scan.nextInt();
        scan.nextLine(); // consume the newline character

        for (int i = 1; i <= numberOfParagraphs; i++) {
            System.out.print("Paragraph " + i + ": ");
            String currentParagraph = scan.nextLine();
            CurrentWork.add(currentParagraph);
        }
        Print.printSave();
        yesOrNo = scan.nextLine();
        int checker = isSaved.checkIsYesOrNo(yesOrNo);
        if (checker == 1) {
            workVector.add(CurrentWork);
            showMain.displayMenu();
        } else
            showMain.displayMenu();
    }
}