package test10;
public class CheckLettersOrDigits {
    public static void main(String[] args) {
        String str1 = "Hello123";
        String str2 = "Hello 123";

        boolean containsOnlyLettersOrDigits1 = checkLettersOrDigits(str1);
        boolean containsOnlyLettersOrDigits2 = checkLettersOrDigits(str2);

        System.out.println("String 1 contains only letters or digits: " + containsOnlyLettersOrDigits1);
        System.out.println("String 2 contains only letters or digits: " + containsOnlyLettersOrDigits2);
    }

    static boolean checkLettersOrDigits(String inputStr) {
        for (char c : inputStr.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
