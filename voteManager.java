import java.util.Scanner;
import java.util.ArrayList;

public class voteManager {

    private Scanner s = new Scanner(System.in);
    private Entity villain;
    private Entity chosen;
    private ArrayList<Entity> entities;
    private String voteName = "";
    private ArrayList<Entity> options = new ArrayList<>();

    public voteManager(ArrayList<Entity> entities) {
        this.entities = entities;

        for (int i = 0; i < entities.size(); i++) {
            Entity temp = entities.get(i);
            if (temp.getNPC()) {
                (this.options).add(temp);
            }
            if (temp.getTag()) {
                this.villain = temp;
            }
        }
        this.chosen = new Entity("", "", "", "", "NPC");

    }

    public void voteNow()
    {

        System.out.print("Hey, is time to vote!\n");
        displayEntities();
        System.out.print("You can only pick one NPC above. Enter their full name.\n>> ");
        voteName=s.nextLine();
        setChosen(voteName);

        while(!isVote()) {
            System.out.println("Invalid entry. Try again.\n>>");
            voteName=s.nextLine();
        }
        determinedVillain();

    }

    private void displayEntities() {
        for (int i = 0; i < this.options.size(); i++)
            System.out.println((this.options.get(i)).getTitle() + ", ");
        return;
    }


    private boolean isVote() {

        if (voteName != null) {//if(player press any button)
            System.out.print("You pick: " + voteName+"\n");

            for (int i =  0; i < options.size(); i++) {
                Entity temp = options.get(i);
                if (temp.getTitle().contains(voteName)) {
                    return true;
                }
            }

        }
        return false;
    }

    private Entity checkEntity() {
        for (int i =  0; i < options.size(); i++) {
            Entity temp = options.get(i);
            if (temp.getTitle().contains(voteName)) {
                return temp;
            }
        }
        return null;
    }

    private Entity getVillain() {
        for (int i =  0; i < options.size(); i++) {
            Entity villain = options.get(i);
            if (villain.getTag()) {
                return villain;
            }
        }
        return null;
    }

    private void determinedVillain()
    {
        if(getVillain() == checkEntity())
        {
            System.out.print("Good job, murderer is dead!\nGame over.");
        }
        else
        {
            System.out.print("Oh no! You pick a wrong murderer.\n");
            System.out.print("You have been killed by the real murderer.\n");
            System.out.print("Game over, good luck next time.\n");
            //interface back to beginning page, beginning need to have exit button.
        }
        return;

    }

    private void setVoteName(String voteName) {
        //set vote name=button(npc)player click
        this.voteName = voteName;
    }

    private void setChosen(String voteName) {
        for (int i = 0; i < options.size(); i++) {
            Entity temp = options.get(i);
            if (temp.getTitle().equals(voteName)) {
                chosen = temp;
            }
        }
    }


}
