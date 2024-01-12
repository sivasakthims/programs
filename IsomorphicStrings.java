package test10;
public class IsomorphicStrings {
    public static void main(String[] args) {
        String str1 = "egg";
        String str2 = "add";

        boolean isIsomorphic = areIsomorphic(str1, str2);

        if (isIsomorphic) {
            System.out.println(str1 + " and " + str2 + " are isomorphic.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not isomorphic.");
        }
    }

    static boolean areIsomorphic(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] mapping1 = new int[256];
        int[] mapping2 = new int[256];

        for (int i = 0; i < str1.length(); i++) {
            char char1 = str1.charAt(i);
            char char2 = str2.charAt(i);

            if (mapping1[char1] == 0 && mapping2[char2] == 0) {
                mapping1[char1] = char2;
                mapping2[char2] = char1;
            } else if (mapping1[char1] != char2 || mapping2[char2] != char1) {
                return false; 
            }
        }

        return true;
    }
}

