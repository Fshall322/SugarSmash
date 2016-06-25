/**
 * Created by Frank Hall on 6/25/2016.
 */
import java.util.Scanner;

public class DemoSugarSmashPlayer
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);// scanner input instance

        SugarSmashPlayer player1 = new SugarSmashPlayer();// sugarsmash object
        String answer = "yes";
        int hScore, level;

        System.out.println("Enter in an Id number..");// user input for id number and user name
        player1.setIdNumber(input.nextInt());
        System.out.println("Enter in a user name");
        input.nextLine();
        player1.setScreenName(input.nextLine());

        System.out.println("Would you like to buy the premium version"); // asks the user if they would like to purchase the premium version of the software.
        answer = input.nextLine(); // answer input
        if(answer.charAt(0) == 'y' || answer.charAt(0) == 'Y' ) //if the answer is yes the following code will run
        {
            System.out.println("Your have purchased the premium version for $2.99\n You may begin");// tells the user they chose to buy the and are using the premuim version
            SugarSmashPlayer player2 = new SugarSmashPlayer(); // new object

            for(int x = 1; x < 40; ++x)// makes sure that the program doesnt try to make you enter more thatn 40 values.
            {
                System.out.println("Enter in a high score for level " + x+":");// prompts the user to enter in  the value of their high scores.
                hScore = input.nextInt();
                player2.setHighScore(hScore, x);
            }

            System.out.println("output for " +player2.getScreenName()+ "\n\t ID: " +player2.getIdNumber()); // returns the username and id number of the user

            for(int x = 1; x < 40; ++x)
                System.out.println("\n\t Level: "+x+ "\tScore: " +player2.getHighScore(x));
        }

        else // if the premium version of the game was not purchased, the following code will run allowing the user to only got to level 9
        {
            for(int x = 1; x < 10; ++x)
            {
                System.out.println("Enter in a high score for level " + x+":");
                hScore = input.nextInt();
                player1.setHighScore(hScore, x);
            }

            System.out.println("output for " +player1.getScreenName()+ "\n\t ID: " +player1.getIdNumber());

            for(int x = 1; x < 10; ++x)
                System.out.println("\n\t Level: "+x+ "\tScore: " +player1.getHighScore(x));
        }
    }
}
