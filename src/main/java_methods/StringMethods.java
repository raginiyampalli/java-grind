package java_methods;

import java.util.List;

public class StringMethods {
    /**
     * concat() Note: returns the concatenated string without modifying the original string.
     * length()
     * contains(string)
     * substring(startIndex)
     * substring(startIndex,endIndex) Note: endIndex is excluded.
     * equals(string)
     * equalsIgnoreCase(string)
     * indexOf()
     * lastIndexOf()
     * startsWith()
     * endsWith()
     * toCharArray()
     * toLowerCase()
     * toUpperCase()
     * replace(charSeq,charSeq)
     * split(regex) Note: returns String[]
     * trim() Note: removes leading and trailing white spaces without impacting the original string.
     * String.join(delimiter,string 1, string2) Note:To join multiple strings.
     * @param args
     */
    public static void main (String args[]){

        String input = "Hello How are you";
        System.out.println(input.length());
        System.out.println(input.contains("you"));
        System.out.println(input.contains("H"));
        System.out.println(input.substring(3));
        System.out.println(input.substring(3,4));

        String input2 = "hello how are you";
        System.out.println(input.equals(input2));
        System.out.println(input.equalsIgnoreCase(input2));

        System.out.println(input2.concat(input));
        System.out.println(input2);

        String replacedString = input.replace("He", "t");
        System.out.println("After replacing : "+replacedString);

        String[]  array = input2.split(" ");
        System.out.println(array.length);

        String test = "   test   hello   ";

        System.out.println(test.trim());

        String result = String.join(" ",input,input2,test);
        System.out.println(result);




    }
}
