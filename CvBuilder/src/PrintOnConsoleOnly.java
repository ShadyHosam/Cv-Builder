public class PrintOnConsoleOnly {
    public String menuSection(int CurrentLine) {
        if (CurrentLine == 0)
            return "1. Add Information.\n";
        else if (CurrentLine == 1)
            return "2. Add Summary.\n";
        else if (CurrentLine == 2)
            return "3. Add Work Experience.\n";
        else if (CurrentLine == 3)
            return "4. Add Education.\n";
        else if (CurrentLine == 4)
            return "5. Add Skills.\n";
        else if (CurrentLine == 5)
            return "6. Save CV.\n";
        else if (CurrentLine == 6)
            return "7. Exit.\n";
        else return null;

    }

    public String informationSection(int CurrentLine) {
        if (CurrentLine == 0)
            return "1. Enter Name:";
        else if (CurrentLine == 1)
            return "2. Enter Title:";
        else if (CurrentLine == 2)
            return "3. Phone:";
        else if (CurrentLine == 3)
            return "4. Email:";
        else if (CurrentLine == 4)
            return "5. Address:";
        else
            return null;
    }

    public void printSave() {
        System.out.println("Save? [y,n]\n");
    }

    public void workExp(int CurrentLine) {
        if (CurrentLine == 0) {
            System.out.println("1. Title:");
        }
        if (CurrentLine == 1) {
            System.out.println("2. Company:");
        }
        if (CurrentLine == 2) {
            System.out.println("3. From date: ");
        }
        if (CurrentLine == 3) {
            System.out.println("4. To date: ");
        }
    }

    public String summarySection() {
        String summary = "1. Enter paragraph:";
        return summary;
    }

    public void paragraph() {
        System.out.println("5. Number of paragraphs:");
    }

    public void printForEducation(int CurrentLine) {
        if (CurrentLine == 0)
            System.out.println(CurrentLine + 1 + ".School:\n");
        if (CurrentLine == 1)
            System.out.println(CurrentLine + 1 + ".Degree:\n");
        if (CurrentLine == 2)
            System.out.println(CurrentLine + 1 + ".From year: \n");
        if (CurrentLine == 3)
            System.out.println(CurrentLine + 1 + ".To year: \n");
        if (CurrentLine == 4)
            System.out.println(CurrentLine + 1 + ".Field of study: \n");
    }

    public void printForSkills(int CurrentLine) {
        if (CurrentLine == 0) {
            System.out.println(CurrentLine + 1 + ". Skill type name:");
        }
        if (CurrentLine == 1) {
            System.out.println(CurrentLine + 1 + ". Skills:");
        }

    }

    public String printBreakLine() {
        return ("--------------------------------------------------------------------\n");
    }

    public void printBadInput() {
        System.out.println("Please enter Valid input !! ");
    }
}
