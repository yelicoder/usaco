public class ReverseString6 {

    /*
    1. Set the left index equal to 0 and right
   index equal to the length of the string -1.
2. Swap the characters of the start index
   scanning with the last index scanning
   one by one. After that, increase the left
   index by 1 (left++) and decrease the right
   by 1 i.e., (right--) to move on to the next
   characters in the character array .
3. Continue till left is less than or equal to
   the right.
     */

    public static void main(String[] args)
    {
        String input = "Name the project nd change the default location if necessary";

        char[] tmp = input.toCharArray();
        int left = 0,
        right = tmp.length - 1;


        for (left = 0; left < right; left++, right--) {
            // Swap values of left and right
            char temp = tmp[left];
            tmp[left] = tmp[right];
            tmp[right] = temp;
        }

        for (char c : tmp)
            System.out.print(c);
        System.out.println();
    }
}
