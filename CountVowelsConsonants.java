package test9;
public class CountVowelsConsonants {
    public static void main(String[] args) {
        String inputString = "JavaProgrammingLanguage";
        inputString = inputString.toLowerCase(); // Convert to lowercase for case-insensitivity

        int vowels = 0, consonants = 0;

        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Total number of vowels: " + vowels);
        System.out.println("Total number of consonants: " + consonants);
    }
}
