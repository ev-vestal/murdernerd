import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.*;
import javax.swing.*;
import java.util.ArrayList;

public class GUI {

    public final int FRAME_WIDTH = 800;
    public final int FRAME_HEIGHT = 600;
    private static JFrame window;
    private static gameBoard gb;

    public GUI() {
        Initialize();
    }

    private void Initialize() {
        gb = new gameBoard();
        window = new JFrame();
        window.setSize(800, 600);
        window.setVisible(true);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.add(gb);
    }

}


