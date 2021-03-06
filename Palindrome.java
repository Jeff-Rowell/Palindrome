package jRowellHw4;
import java.util.Scanner;

/**
 * This class contains the main method. The main method asks the user for an 
 * input string, then checks the string for being a palindrome. Once the
 * input string is checked, the palindrome result is displayed to the screen. 
 * 
 * @author jeffrowell
 */
public class Palindrome 
{
    
    /**
     * The main method requests an input string from the user, then checks 
     * whether or not the string is a palindrome(reads the same from front to
     * back, and from back to front). The result is displayed to the screen.
     * @param args 
     */
    public static void main(String[] args) 
    {
    
        final int DEFAULT_SIZE = 10;
        Scanner scnr = new Scanner(System.in);
        String palindrome = "";      // The input string read backwords
        Stack charStack = new Stack(100); // Creats an empty stack of chars
        
        System.out.println("Enter a word, phrase, or sentence with less than "
                         + DEFAULT_SIZE + " characters: ");
        
        String inputString = scnr.nextLine();    // The input string
        scnr.close();
        if (inputString.length() > DEFAULT_SIZE) 
        {
            System.err.println("ERROR: Entered input '" + inputString
                             + "' is too large. Exiting program.");
            System.exit(0);
        }
        else if (inputString.equals("")) 
        {
            System.err.println("ERROR: Invalid input, empty phrase. Exiting"
                    + " program" );
            System.exit(0);
        }
        inputString = inputString.toLowerCase(); // Make each char lowercase
        inputString = inputString.replaceAll("\\s", ""); // Delete whitespace
        
            // Loop through the input string, store each char in the charStack
        for (int i = 0; i < inputString.length(); i++) 
        {
                charStack.push(inputString.charAt(i));
        }
        
            // Read the string backwords and store in a new variable
        while (!charStack.isEmpty()) 
        {
            palindrome += charStack.pop();
        }
        
            // Check if inputString is a palindrome
        if (inputString.equals(palindrome)) 
        {
            System.out.println("Is a palindrome!");
        }
        else 
        {
            System.out.println("Is not a palindrome!");
        }
    } 
}
