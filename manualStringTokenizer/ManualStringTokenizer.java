
import java.util.Scanner;

public class ManualStringTokenizer 
{

    public static void main(String args[]) 
    {
        try (Scanner scan = new Scanner(System.in)) 
        {
            String message;
            char delimiter;
            System.out.print("Enter the string: ");
            message = scan.nextLine();
            System.out.print("Enter the delimeter: ");
            delimiter = scan.next().charAt(0);
            stringTokenNizerMethod(message, delimiter);
        }
    }

    public static void stringTokenNizerMethod(String message, char delimiter) 
    {
        String text = "";
        for (int i = 0; i < message.length(); i++) 
        {
            char charDelimiter = message.charAt(i);
            if (charDelimiter != delimiter) {
                text = text + charDelimiter; // adding the character to the string
            } 
            else 
            {
                if (!text.isEmpty()) 
                {
                    System.out.println(text); // display the word and move the cursor to the new line
                    text = ""; // reset the string for next word
                }
            }
        }
        // printing the last token if it exists

        if (!text.isEmpty()) 
        {
            System.out.println(text);
        }

    }
}
