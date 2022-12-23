public class ReverseString {

    /*
    1. The idea is to traverse the length of the string
    2. Extract each character while traversing
    3. Add each character in front of the existing string
     */

    public static void main (String[] args) {

        String str= "Name the project nd change the default location if necessary", nstr="";
        char ch;

        System.out.print("Original word: ");
        System.out.println("Geeks"); //Example word

        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i); //extracts each character
            nstr= ch+nstr; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: "+ nstr);
    }

}
