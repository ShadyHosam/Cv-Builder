public class SectionSummary extends Parent {
    String CurrentSummary = "";
    String YesOrNo = "";
    public void summaryStart() {
        System.out.println(Print.summarySection());
        setSummary();
    }
    private void setSummary() {
        CurrentSummary = scan.nextLine();
        Print.printSave();
        summarySave();

    }
    private void summarySave() {
        while (true) {
            YesOrNo = scan.next();
            int check = isSaved.checkIsYesOrNo(YesOrNo);
            if (check == 1) {
                setSummaryValid();
                showMain.displayMenu();
                break;
            } else if (check == 2) {
                showMain.displayMenu();
                break;
            }
        }
    }

    private void setSummaryValid() {
        summaryInfo = CurrentSummary;
    }
}
