//Entities needs a constructor for other influence
// It needs a method to compare various entities
// it needs a way to display the dialogue of each entity
// and it needs a way to get the clue

import java.awt.*;

public class Entity {
    private String title;
    private String dialogue;
    private String clue1; //true clue
    private String clue2; //false clue
    private boolean villain;
    private boolean NPC;
    private Sprite sprite;
    private int x, y;

    public Entity(String title, String dialogue, String clue1, String clue2, String npc) {
        this.title = title;
        this.dialogue = dialogue;
        this.clue1 = clue1;
        this.clue2 = clue2;
        this.villain = false;

        if (npc.contains("NPC")) {
            NPC = true;
        }
        else {
            NPC = false;
        }

        setSprite();

    }


    /**
     * the display box for the characters. Might convert to a string later.
     * Will likely convert to a string later.
     */
    public void displayDialogueBox() {
        System.out.println(title + ": " + dialogue);
    }

    /**
     * Function to send the designated clue
     * @param i int to determine which clue the pass is calling
     * @return returns the string of the clue to the player
     */
    public String passClue(int i) { //assume we take in 1
        if (i == 1) {
            return clue1;
        }
        else
            return clue2;
    }

    /**
     * Passes the title/name of the entity
     * @return the title of the entity
     */
    public String getTitle() {
        return title;
    }

    /**
     * Used by the gameStats to tag the villain.
     */
    public void tagEntity() {
        villain = true;
    }

    /**
     * Returns the status of the entity
     * @return t/f if they are villain
     */
    public boolean getTag() {
        return villain;
    }

    public boolean getNPC() {return NPC;}

    private void setSprite() {
        int x = (int)(750*Math.random());
        int y = (int)(550*Math.random());
        int width = (int)(40*Math.random());

        if (NPC == true) {
            sprite = new Sprite(x, y, width, Color.RED);
        }
        else {
            sprite = new Sprite(x, y, width, Color.BLUE);
        }

    }

    public Sprite getSprite() {
        return sprite;
    }

}
