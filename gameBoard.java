import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class gameBoard extends JPanel {
    //private Timer timer;
    //private final int DELAY = 1000;
    //private JButton test;
    private gameStats gameData;
    private ArrayList<Entity> data;


    public gameBoard() {
        super();
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.setVisible(true);
        this.setSize(new Dimension(800, 600));
        gameData = new gameStats();
        data = gameData.getEntities();


        System.out.println("Created Board");
    }

    @Override
    public void paintComponents(Graphics graphics) {
        super.paintComponents(graphics);
        for (int i = 0; i < 5; i++) {
            data.get(i).getSprite().draw((Graphics2D) graphics);
        }
        repaint();
    }


}
