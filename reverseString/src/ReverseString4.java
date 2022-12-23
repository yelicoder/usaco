public class ReverseString4 {

    /*
    First, convert String to character array
   by using the built in Java String class
   method toCharArray().
2. Then, scan the string from end  to start,
   and print the character one by one.
     */

    public static void main(String[] args)
    {
        String input = "Name the project nd change the default location if necessary";

        // convert String to character array
        // by using toCharArray
        char[] try1 = input.toCharArray();

        for (int i = try1.length - 1; i >= 0; i--)
            System.out.print(try1[i]);
    }
}
