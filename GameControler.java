package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.io.File;

public class GameControler {

    private gameStats getEntity;
    private VoteManger voteNow;
    private JButton startGameButton;
    private JPanel panel1;
    private JButton quitGameButton;
    private JTextField textField1;

    /**
     * This will set up the first gui form.
     * @param args
     */
    public static void main(String[] args)
    {
        JFrame frame=new JFrame("Murdernerd");
        frame.setLocation(500,500);
        frame.setSize(500,500);
        frame.setBackground(Color.ORANGE);
        frame.setContentPane(new GameControler().panel1);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    /**
     * This is Game controler class to set up whole interface for game
     */
    public GameControler()
    {
        //VoteManger vote=new VoteManger();
        gameStats gameData = new gameStats();
        Entity test = gameData.getEntity();
        String name = test.getTitle();
        //ImageIcon image=new ImageIcon("background.jpg");
        panel1.setBackground(Color.PINK);
        /**
         * performed start button action.
         * Start button will contain all the frame shows up later.
         */
        startGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JWindow w=new JWindow();
                JOptionPane.showMessageDialog(null,"Ready? Press OK to start the game.");
                JFrame frame2=new JFrame("Find out who is Murderer");
                frame2.setLocation(400,400);
                frame2.setSize(500,500);
                frame2.setBounds(200,200,200,200);
                frame2.setBackground(Color.CYAN);
                JButton frameTwoVoteButton=new JButton("Vote Now");
                frame2.add(frameTwoVoteButton,BorderLayout.SOUTH);
                /**
                 * This is vote button on frame two.
                 * It will performed on vote button.
                 */
                frameTwoVoteButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JWindow w2=new JWindow();
                        JFrame frame3=new JFrame("Time to Vote!");
                        frame3.setLocation(600,600);
                        frame3.setSize(500,500);
                        frame3.setBackground(Color.magenta);
                        JButton firstNPCButton=new JButton();
                        firstNPCButton.setText("NPC 1");
                        JButton secondNPCButton=new JButton();
                        secondNPCButton.setText("NPC 2");
                        JButton thirdNPCButton=new JButton();
                        thirdNPCButton.setText("NPC 3");
                        frame3.add(firstNPCButton,BorderLayout.WEST);
                        frame3.add(secondNPCButton,BorderLayout.CENTER);
                        frame3.add(thirdNPCButton,BorderLayout.EAST);
                        /**
                         * This is the first NPC button.
                         * It wil perform when click this button.
                         */
                        firstNPCButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                JWindow w3=new JWindow();
                                if(e.getActionCommand().equals("NPC 1"))
                                {
                                    JOptionPane.showMessageDialog(null,"YOU LOSE!");
                                }
                            }
                        });
                        /**
                         * This is the second NPC button.
                         * It wil perform when click this button.
                         */
                        secondNPCButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                JWindow w3=new JWindow();
                                if(e.getActionCommand().equals("NPC 2"))
                                {
                                    JOptionPane.showMessageDialog(null,"YOU LOSE!");
                                }
                            }
                        });
                        /**
                         * This is the third NPC button.
                         * It wil perform when click this button.
                         */
                        thirdNPCButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                JWindow w3=new JWindow();
                                if(e.getActionCommand().equals("NPC 3"))
                                {
                                    JOptionPane.showMessageDialog(null,"YOU WIN!");
                                }
                            }
                        });
                        frame3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        frame3.pack();
                        frame3.setVisible(true);

                    }
                });
                frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame2.pack();
                frame2.setVisible(true);
            }

        });

        /**
         * This is quite game button.
         * It will perform when you click quit game button.
         */
        quitGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    System.exit(0);

            }
        });

    }


}
