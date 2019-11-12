import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;


public class Player
{
    //gameStats obj = new gameStats();
    //String c1, c2;
    private Entity passClue;
    private gameStats getEntity;
    Collection<ArrayList<Entity>> player = new ArrayList<ArrayList<Entity>>();
    ArrayList<Entity> notepad = new ArrayList<Entity>();
   // ArrayList<String> player = new ArrayList<String>();
    private ArrayList<Entity> entities;


    public Player()
    {
        System.out.println("Player 1, please enter your user name: ");
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        System.out.println("Player 2, please enter your user name: ");
        Scanner input = new Scanner(System.in);
        String t = scan.next();
        
        System.out.println(s + ", please vote");
        System.out.println(t + ", please vote");
    }

    public void setPassClue()
    {
        //testing .add function
        player.add(entities);
        System.out.println(player);
    }
    public void Player(ArrayList<Entity> entities)
    {
        this.entities = entities;


    }
}
