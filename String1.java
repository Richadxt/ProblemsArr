import java.util.Scanner;

public class String1 {

    // WAP A PROGRAM TO REMOVE GIVEN CHARACTERS FROM A STRING

        public static void main(String[] args) {
            String str = "India is my country";
            System.out.println(str.length());
            System.out.println(charRemoveAt(str, 6));
        }
        public static String charRemoveAt(String str, int p) {

            return str.substring(0, p) + str.substring(p + 1);
        }
}
