package test9;
public class DivideStringIntoGroups {
    public static void main(String[] args) {
        String inputString = "abcdefghij";
        int groupSize = 3;
        String fillCharacter = "x";

        for (int i = 0; i < inputString.length(); i += groupSize) {
            String group = inputString.substring(i, Math.min(i + groupSize, inputString.length()));
            while (group.length() < groupSize) {
                group += fillCharacter;
            }
            System.out.println(group);
        }
    }
}
