public class SectionEducation extends Parent {


    public void startEducation() {
        setEducation();
    }

    private void setEducation() {
        for (int i = 0; i < 5; i++) {
            Print.printForEducation(i);
            String CurrentInfo = scan.nextLine();
            if (i == 0 || i == 1) {
                int checkForValid = ValidationForInput.validationForEdu(CurrentInfo);
                while (checkForValid == 0) {
                    Print.printBadInput();
                    CurrentInfo = scan.nextLine();
                    checkForValid = ValidationForInput.validationForEdu(CurrentInfo);
                }
            }
            if (i == 2) {
                int checkForValid = ValidationForInput.validationForYearOnly(CurrentInfo, 1);
                while (checkForValid == 0) {
                    Print.printBadInput();
                    CurrentInfo = scan.nextLine();
                    checkForValid = ValidationForInput.validationForYearOnly(CurrentInfo, 1);
                }
                fromYear = CurrentInfo;
            }
            if (i == 3) {
                int checkForValid = ValidationForInput.validationForYearOnly(CurrentInfo, 2);
                while (checkForValid == 0) {
                    Print.printBadInput();
                    CurrentInfo = scan.nextLine();
                    checkForValid = ValidationForInput.validationForYearOnly(CurrentInfo, 2);
                }
            }
            if (i == 4) {
                int checkForValid = ValidationForInput.validationForNames(CurrentInfo);
                while (checkForValid == 0) {
                    Print.printBadInput();
                    CurrentInfo = scan.nextLine();
                    checkForValid = ValidationForInput.validationForNames(CurrentInfo);
                }
            }
            tempEducation[i] = CurrentInfo;
        }
        Print.printSave();
        String type = scan.nextLine();
        int check = isSaved.checkIsYesOrNo(type);
        if (check == 1) {
            educationAfterSaving = tempEducation;

            allSections[1] = true;
            showMain.displayMenu();

        } else
            showMain.displayMenu();

    }

}
