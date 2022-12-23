public class ReverseString3 {

    /*
    Using built in reverse() method of the StringBuilder class
     */

    public static void main(String[] args)
    {
        String input = "Name the project nd change the default location if necessary";

        StringBuilder input1 = new StringBuilder();

        // append a string into StringBuilder input1
        input1.append(input);

        // reverse StringBuilder input1
        input1.reverse();

        // print reversed String
        System.out.println(input1);
    }
}
