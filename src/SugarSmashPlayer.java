/**
 * Created by Frank Hall on 6/25/2016.
 */
public class SugarSmashPlayer // begin class
{
    private int idNumber; // variable declerations
    private String screenName;
    protected int[] highScore; // array decleration

    public SugarSmashPlayer() // constructor
    {
        highScore = new int[10];
    }

    public void setIdNumber(int id) // set and get methods
    {
        idNumber = id;
    }

    public int getIdNumber()
    {
        return idNumber;
    }

    public void setScreenName(String sn)
    {
        screenName = sn;
    }

    public String getScreenName()
    {
        return screenName;
    }

    public int getHighScore(int level) //get method that is doing validation
    {
        int score = 0;

        if(level < 1 || level > 10)
            System.out.println("Invalid level");

        else
            score = highScore[level-1];

        return score;
    }

    public void setHighScore(int score, int level) //set method that is doing validation
    {
        int previousLevel = 0;

        if(level == 1)
        {
            highScore[level-1] = score;
        }

        else
        {
            previousLevel = highScore[level-2];

            if(previousLevel < 100)
                System.out.println("Did not achieve 100 pts on previouslevel. Score not set");

            else
                highScore[level-1] = score;
        }
    }
}
