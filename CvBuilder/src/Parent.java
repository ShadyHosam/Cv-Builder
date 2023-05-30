

public class Parent extends ManageAllVariables {

    public void education() {
        SectionEducation sectionEducation = new SectionEducation();
        sectionEducation.startEducation();

    }
    public void infoSection() {
        SectionInformation info = new SectionInformation();
        System.out.println("\t\t\t\t\t Add Information\n");
        info.startInfoSection();
    }

    public void summarySection() {

        SectionSummary sectionSummary = new SectionSummary();
        System.out.println("\t\t\t\t\t Add Summary\n");
        sectionSummary.summaryStart();
    }

    public void workExperience() {
        SectionWorkExperience sectionWorkExperience = new SectionWorkExperience();
        System.out.println("\t\t\t\t\t Add WorkExperience\n");
        sectionWorkExperience.workExperienceStart();
    }

    public void addSkills() {
        SectionSkills sectionSkills = new SectionSkills();
        System.out.println("\t\t\t\t\t Add Skills\n");

        sectionSkills.startSkills();
    }

    public void saveCv() {
        String fillAgain = "Please Fill your";
        for (int i = 0; i < 2; i++) {
            if (!allSections[i]) {
                if (i == 0)
                    System.out.println(fillAgain + " Information");
                if (i == 1)
                    System.out.println(fillAgain + " Education");
                showMain.displayMenu();
            }
        }
        PrintFinalCv saveFinalCv = new PrintFinalCv();
        saveFinalCv.StartSaving();
    }
    public void out() {
        System.out.println("Program terminated.\n");
    }

}
