import java.util.regex.*;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ValidationForInput {
    static String bad = "The date string is invalid.";

    public static int validationForNames(String input) {
        // Name,Title,Field of study,Skill type name,Skill
        if (input == null) return 0;
        if (Pattern.matches("^[a-zA-Z.\\-\\s]+$", input)) return 1;
        else return 0;
    }

    public static int validationForEmail(String input) {
        if (input == null) return 0;
        if (Pattern.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$", input)) return 1;
        else return 0;
    }

    public static int validationForPhone(String input) {
        if (input == null) return 0;

        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {

                return 0;
            }
        }
        return 1;
    }

    public static int validationForDate(String input, int typeOfDate) {
        if (input == null) return 0;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM yyyy");
        if (typeOfDate != 1) {
            if (input.equals("Present")) return 1;
        }
        try {
            YearMonth yearMonth = YearMonth.parse(input, formatter);
            return 1;
        } catch (DateTimeParseException e) {
            System.out.println(bad);
            return 0;
        }
    }

    public static int validationForEdu(String input) {
        if (input == null) return 0;
        // Name,Title,Field of study,Skill type name,Skill
        if (Pattern.matches("^[a-zA-Z.‘\\-\\s]+$", input)) return 1;
        else return 0;
    }

    public static int validationForYearOnly(String input, int typeOfDate) {
        if (input == null) return 0;
        Pattern pattern = Pattern.compile("^(?:\\d{4})$");
        int first = 0;
        int second = 0;
        Matcher matcher = pattern.matcher(input);
        if (typeOfDate == 1) {
            try {
                if (matcher.find()) return 1;
            } catch (DateTimeParseException e) {
                return 0;
            }
        } else {
            try {
                first = Integer.parseInt(ManageAllVariables.fromYear);
                second = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("enter valid input !! ");
            }
            try {
                if (matcher.find() && second > first) return 1;
            } catch (DateTimeParseException e) {
                return 0;
            }
        }
        return 0;

    }
}
