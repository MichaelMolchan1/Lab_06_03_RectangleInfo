import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double width = 0;
        double height = 0;
        double perimeter;
        double diagonal;
        String trash = "";

        //Input for width
        System.out.print("Enter the width of the rectangle: ");
        if(in.hasNextDouble())
        {
            // OK safe to read in a double
            width = in.nextDouble();
            in.nextLine(); // clears the newline from the buffer
        }
        else
        {
            // Not a double can’t use nextDouble() read as String with nextLine() instead
            trash = in.nextLine();
            System.out.println("\nYou said your width was: " + trash);
            System.out.println("Run the program again and enter a valid amount!");
            System.exit(0);  // terminate the program
        }

        //Input for height
        System.out.print("Enter the height of the rectangle: ");
        if(in.hasNextDouble())
        {
            // OK safe to read in a double
            height = in.nextDouble();
            in.nextLine(); // clears the newline from the buffer
        }
        else
        {
            // Not a double can’t use nextDouble() read as String with nextLine() instead
            trash = in.nextLine();
            System.out.println("\nYou said your width was: " + trash);
            System.out.println("Run the program again and enter a valid amount!");
            System.exit(0);  // terminate the program
        }

        // Calculation for perimeter
        perimeter = (width * 2.0) + (height * 2.0);
        System.out.println("The perimeter of your rectangle is " + perimeter + " units");

        // Calculation for diagonal
        diagonal = (width * width) + (height * height);
        diagonal = Math.sqrt(diagonal);
        System.out.println("The diagonal of your triangle is " + diagonal + " units");


    }
}