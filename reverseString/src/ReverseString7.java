import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseString7 {

    /*
    Using ArrayList object: Convert the input string into the
    character array by using toCharArray() built in method.
    Then, add the characters of the array into the ArrayList object.
    Java also has built in reverse() method for the Collections class.
    Since Collections class reverse() method takes a list object, to reverse the list,
    we will pass the ArrayList object which is a type of list of characters.

    1. We copy String contents to an object
   of ArrayList.
    2. We create a ListIterator object by using
   the listIterator() method on the ArrayList
   object.
    3. ListIterator object is used to iterate over
   the list.
    4. ListIterator object helps us to iterate
   over the reversed list and print it one
   by one to the output screen.
     */

    public static void main(String[] args)
    {
        String input = "Name the project nd change the default location if necessary";

        char[] tmp = input.toCharArray();
        List<Character> try1 = new ArrayList<>();

        for (char c : tmp)
            try1.add(c);

        Collections.reverse(try1);
        ListIterator li = try1.listIterator();
        while (li.hasNext())
            System.out.print(li.next());
    }
}
