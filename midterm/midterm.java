//Dewey Kincheloe

import java.util.*;
import java.io.*;

public class midterm
{
    //Attributes
    //Constructors
    //Methods
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
                String reversed = obj.reverse(line);
                if (line.equals(reversed))
                {
                    System.out.println(line + " is a palindrome");
                }
                
                else
                {
                    System.out.println(line + " is not a palindrome, reversed " + line + " is " + reversed);
                }
                
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
    }
}