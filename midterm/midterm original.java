//Dewey Kincheloe

import java.util.*;
import java.io.*;

public class midterm
{

    //Attributes
    //Constructors
    //Methods
    /*
    public boolean isPalindrome(String word)
    {
        if (word == null)
        {
            return false;
        }
        String reversed = reverse(word);
        if (word.equals(reversed))
        {
            System.out.println(word + " is a palindrome");
            return true;
        }
        
        else
        {
            System.out.println(word + " is not a palindrome, reversed " + word + " is " + reversed);
            return false;
        }
        
    }
    */
    
    public String reverse(String word)
    {
        if (word.length() <= 1)
        {
            return word;
        }
        return reverse(word.substring(1)) + word.charAt(0);
    }
    
    public static void main(String[] args)
    {
        String inputFile = args[0];
        File f = new File(args[0]);
        //String [] array = new String[4];
        String [] array = new String[22];
        midterm obj = new midterm();
        
        if (args.length == 0)
        {
            System.out.println("File name not entered.");
        }
        
        try
        {
            Scanner input = new Scanner(new File(inputFile));
            int i = 0;
            while (input.hasNext())
            {
                String line = input.nextLine();
                array[i] = line;
                i++;
            }
            System.out.printf("Processing Complete");
            input.close();
        }
        catch (Exception e)
        {
            System.out.println("Unable to read file");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++)
        {
            String word = array[i];
            //obj.isPalindrome(word);
            if (word != null)
            {
                
            
            String reversed = obj.reverse(word);
            if (word.equals(reversed))
            {
                System.out.println(word + " is a palindrome");
                //return true;
            }
            
            else
            {
                System.out.println(word + " is not a palindrome, reversed " + word + " is " + reversed);
                //return false;
            }
            }
        }
    }

}