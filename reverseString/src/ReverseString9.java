import java.util.Scanner;

public class ReverseString9 {

    /*
    Take user input
     */

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // conversion from String object to StringBuffer
        StringBuffer sbr = new StringBuffer(input);
        // To reverse the string
        sbr.reverse();
        System.out.println(sbr);
    }
}
