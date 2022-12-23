import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseString8 {

    /*
    String class does not have reverse() method, we need to convert the input string to StringBuffer,
    which is achieved by using the reverse method of StringBuffer.
     */

    public static void main(String[] args)
    {
        String input = "Name the project nd change the default location if necessary";

        // conversion from String object to StringBuffer
        StringBuffer sbr = new StringBuffer(input);
        // To reverse the string
        sbr.reverse();
        System.out.println(sbr);
    }
}
