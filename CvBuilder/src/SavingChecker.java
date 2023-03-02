import java.util.Objects;

public class SavingChecker {

    public int checkIsYesOrNo(String ch) {
        if (Objects.equals(ch, "y")) {
            System.out.println("Saved Done !! ");
            return 1;
        } else if (Objects.equals(ch, "n")) {
            System.out.println("Back to main menu ! ");
            return 2;
        } else {
            System.out.print("Enter Vaild Input or Back To Main Menu by 'n'!");
            return 3;
        }

    }
}
