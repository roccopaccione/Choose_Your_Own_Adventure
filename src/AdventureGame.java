import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class AdventureGame {
   JFrame window;
   Container con;
   JPanel gameTitlePanel;
   JLabel gameTitleLabel;
   Font titleFont = new Font("Serif", Font.PLAIN, 60);

    public static void main(String[] args) {
     new AdventureGame();
    }

    public AdventureGame(){
//        Creating JFrame Window
        window = new JFrame();
        window.setSize(1000, 700); //Setting width and height of Window
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.DARK_GRAY); // Setting Bg Color
        window.setLayout(null);
        window.setVisible(true); // Making window visible
        con = window.getContentPane();

        gameTitlePanel = new JPanel();  // Creating a panel for behind title text
        gameTitlePanel.setBounds(100, 150, 800, 150);
        gameTitlePanel.setBackground(Color.DARK_GRAY);
        gameTitleLabel = new JLabel("Labyrinth"); // Setting Title text
        gameTitleLabel.setForeground(Color.ORANGE);
        gameTitleLabel.setFont(titleFont);

        gameTitlePanel.add(gameTitleLabel);
        con.add(gameTitlePanel);

    }

}



//    public void fighterSelector(){
//        System.out.println("Please %s, choose your type of hero!\n" +
//                "1 - Shining Knight\n" +
//                "2 - Shonen Warrior\n" +
//                "3 - Kamikaze\n" +
//                "4 - Battle Warrior\n" +
//                "5 - Sprinting Freelance");
//
//    }