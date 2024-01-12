package test9;
public class ImmutableStrings {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = str1.concat(" World");

        System.out.println("Original string: " + str1);

        System.out.println("Concatenated string: " + str2);
    }
}
