package midterm;
import java.util.Scanner;
import java.util.ArrayList;
/*
 * Dawn Myers
 * ITDEV 140 Mequon 2016
 */


/**
 *
 * @author Dawn
 */
public class Midterm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> friends = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        int maxListLength = 3;
        
        for(int i = 0; i < maxListLength; i++)
        {
            System.out.print("Please enter a friend's name: ");
            friends.add(in.next());
        }
        
        System.out.println("You have " + friends.size() + " friends.");
    }
    
}
