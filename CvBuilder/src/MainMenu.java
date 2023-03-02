public class MainMenu extends Parent {
    // private int action;
    String action;

    public void displayMenu() {
        for (int i = 0; i < 7; i++)
            System.out.println(Print.menuSection(i));

        System.out.println("Choice? [1-7]: ");
        action = scan.nextLine();
        if (action.matches("\\d+")) {
            int number = Integer.parseInt(action);

            while (number < 1 || number > 7) {
                System.out.println("Please Enter Valid option ! ");
                number = scan.nextInt();
            }
            goForAction(number);
        } else {
            System.out.println("Please Enter Valid option ! ");
            displayMenu();
        }
    }

    private void goForAction(int action) {
        if (action == 1)
            infoSection();
        if (action == 2)
            summarySection();
        if (action == 3)
            workExperience();
        if (action == 4)
            education();
        if (action == 5)
            addSkills();
        if (action == 6)
            saveCv();
        if (action == 7)
            out();
    }


}
