import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.util.ArrayList;

public class GameControl {

    public static void main(String[] args) {
        gameStats newGame = new gameStats();
        //Player player = new Player(1);

        ArrayList<Entity> data = newGame.getEntities();
        /*for (int i = 0; i <= 5; i++) {
            Entity temp = data.get(i);
            player.addClue((temp.passClue(1)));
        }
        player.displayNotepad();*/

        Entity temp = data.get(0);
        Entity temp2 = data.get(1);

        GUI GUI = new GUI();

    }

    /*private JButton startGameButton;
    private JPanel panel1;
    private JPanel panel2;
    private JButton quitGameButton;
    private JTextField textField1;

    public static void main(String[] args)
    {
        JFrame frame=new JFrame("Murdernerd");
        frame.setLocation(500,500);
        frame.setSize(500,500);
        frame.setContentPane(new GameControl().panel1);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    public GameControl()
    {
        startGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JWindow w=new JWindow();
                JOptionPane.showMessageDialog(null,"Connecting to setting...");
                JFrame frame2=new JFrame("Find out who is Murderer");
                frame2.setLocation(400,400);
                frame2.setSize(500,500);
                frame2.setBackground(Color.CYAN);
                frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame2.pack();
                frame2.setVisible(true);

            }
        });


        quitGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }
        });
        startGameButton.addComponentListener(new ComponentAdapter() {

        });
    }*/

}
