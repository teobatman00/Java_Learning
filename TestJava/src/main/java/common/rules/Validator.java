package common.rules;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    public static boolean checkRegex(String str, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    public static boolean checkCapitalEachWord(String str) {
        String[] words = str.split("\\s");
        StringBuilder newWord = new StringBuilder();
        for (String w : words) {
            newWord.append(w.substring(0, 1).toUpperCase()).append(w.substring(1)).append(" ");
        }
        return str.equals(newWord.toString().trim());
    }

    public static boolean checkContainNumber(String str) {
        char[] chars = str.toCharArray();
        for (char c : chars) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkNumberInRange(int number, int from, int to) {
        return number>=from && number<=to;
    }

}
