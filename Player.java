import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Player {
    public static void main(String[] args)
    {

    }

    private String clue;
    private ArrayList<String> notepad = new ArrayList<String>();

    public void addtoNotepad() {
        notepad.add(clue);
    }

    public void displayNotepad(){
        System.out.println(clue);
    }

    public void playerTurn()
    {

    }




       //Creates a text file and then add information to it in Intellij
    /*    try {
            PrintWriter outputStream = new PrintWriter("Example.txt");

            while (line.length() > 0) ;
            line = keyboard.next();
            outputStream.println(line);

            ArrayList<String> list = new ArrayList<String>();

            while (keyboard.hasNextLine())
            {
                String s = keyboard.nextLine();
                list.add(s);
                if (s.equals("")) break;
            }
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("Error!!") ;
        }*/






}

