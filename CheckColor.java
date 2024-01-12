package test9;
public class CheckColor {
    public static void main(String[] args) {
        String inputString = "blacksea";
        System.out.println("The given string is: " + inputString);

        if (inputString.startsWith("red")) {
            System.out.println("The string begins with the color: red");
        } else if (inputString.startsWith("black")) {
            System.out.println("The string begins with the color: black");
        } else {
            System.out.println("The string does not begin with red or black");
        }
    }
}
