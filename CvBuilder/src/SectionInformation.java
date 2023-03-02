public class SectionInformation extends Parent {
    private static String[] tempInformation = new String[5];
    public void startInfoSection() {
        setTempInformation();
    }
    private void setTempInformation() {
        for (int i = 0; i < 5; i++) {
            String current;
            System.out.println(Print.informationSection(i));
            current = scan.nextLine();
            if (i == 0 || i == 1) {
                int checkForValid = ValidationForInput.validationForNames(current);
                while (checkForValid == 0) {
                    Print.printBadInput();
                    current = scan.nextLine();
                    checkForValid = ValidationForInput.validationForNames(current);
                }
            }
            if (i == 2) {
                int checkForValid = ValidationForInput.validationForPhone(current);
                while (checkForValid == 0) {
                    Print.printBadInput();
                    current = scan.nextLine();
                    checkForValid = ValidationForInput.validationForPhone(current);
                }
            }
            if (i == 3) {
                int checkForValid = ValidationForInput.validationForEmail(current);
                while (checkForValid == 0) {
                    Print.printBadInput();
                    current = scan.nextLine();
                    checkForValid = ValidationForInput.validationForEmail(current);
                }
            }
            tempInformation[i] = current;
        }
        Print.printSave();
        while (true) {

            String checkSave = scan.nextLine();
            int check = isSaved.checkIsYesOrNo(checkSave);
            if (check == 1) {
                setValidInformation(0);
                showMain.displayMenu();
                break;
            } else if (check == 2) {
                showMain.displayMenu();
                break;
            }
        }
    }
    private void setValidInformation(int indexOfSection) {
        validInformation = tempInformation;
        allSections[indexOfSection] = true;
    }
}
