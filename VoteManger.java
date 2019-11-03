package com.company;

import org.jetbrains.annotations.Contract;

import java.util.Scanner;

public class VoteManger {

    Scanner s=new Scanner(System.in);
    private String villainName;
    private String voteName;
    private String player;
    private String NPC1,NPC2,NPC3;

    void voteNow()
    {
        this.setVillainName("Fall");
        this.setNPC1("Fall");
        this.setNPC2("Summer");
        this.setNPC3("Nova");
        System.out.print("Hey, is time to vote!\n");
        System.out.print("You can only pick one NPC above\n");
        System.out.printf(getNPC1()+" "+getNPC2()+" "+getNPC3()+"\n"); //(switch)paint npc1,2,3 with buttons
        voteName=s.nextLine();
        setVoteName(voteName);

        if(isVote())
        {
            determinedVillain();
        }
    }


    @Contract(pure = true)
    private boolean isVote() {

        if (voteName != null) {//if(player press any button)
            System.out.print("You pick: " + voteName+"\n");
        }
        return true;
    }

    private void determinedVillain()
    {
        if(getVillainName().equals(getVoteName()))
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

    }

    private String getVillainName() {
        return villainName;
    }
    public void setVillainName(String villainName) {
        this.villainName = villainName;
    }

    private String getVoteName() {
        return voteName;
    }
    private void setVoteName(String voteName) {
       //set vote name=button(npc)player click
        this.voteName = voteName;
    }

    public String getPlayer() {
        return player;
    }
    public void setPlayer(String player) {
        this.player = player;
    }

    public String getNPC1() {
        return NPC1;
    }
    public void setNPC1(String NPC1) {
        this.NPC1 = NPC1;
    }

    public String getNPC2() {
        return NPC2;
    }
    public void setNPC2(String NPC2) {
        this.NPC2 = NPC2;
    }

    public String getNPC3() {
        return NPC3;
    }
    public void setNPC3(String NPC3) {
        this.NPC3 = NPC3;
    }
}
