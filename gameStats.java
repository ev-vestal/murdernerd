import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class gameStats {

    private ArrayList<Entity> entities = new ArrayList<>();

    public gameStats() {

        String file_path = "C:\\Users\\emma\\Desktop\\CS 321 Programs\\cs321Draft\\src\\entities.txt"; //file path on my computer;
        //still need to determine a method on


        entities = buildEntities(file_path);

    }

    private ArrayList<Entity> buildEntities(String file_path) {

        ArrayList<Entity> entities = new ArrayList<>();
        FileReader eFile;

        try {
            eFile = new FileReader(file_path);
        }
        catch(FileNotFoundException fe) {
            System.err.println("Cannot locate file");
            return null;
        }

        Scanner data = new Scanner(eFile);

        String title = "";
        String dia = "";
        String c1 = "";
        String c2 = "";

        while (data.hasNextLine()) {
            String line = data.nextLine();

            if (line.contains("Title: ")){
                title = line.substring(7);
            }
            else if (line.contains("Dialogue: ")) {
                dia = line.substring(10);
            }
            else if (line.contains("Clue1: ")) {
                c1 = line.substring(7);
            }
            else if (line.contains("Clue2: ")) {
                c2 = line.substring(7);
            }
            else {
                entities.add(new Entity(title, dia, c1, c2));
            }
        }
        return entities;
    }

    public Entity getEntity() {
        return entities.get(0);
    }
}