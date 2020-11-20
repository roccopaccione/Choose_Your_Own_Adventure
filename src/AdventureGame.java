import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class AdventureGame {
   JFrame window;
   Container con;
   JPanel gameTitlePanel, startBtnPanel, mainPlayPanel;
   JLabel gameTitleLabel;
   Font titleFont = new Font("Times New Roman", Font.PLAIN, 85);
   Font beginFont = new Font("Sans-Serif", Font.PLAIN, 40);
   JButton startButton;
   JTextArea mainText;

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
        gameTitlePanel.setBounds(100, 100, 800, 200);
        gameTitlePanel.setBackground(Color.DARK_GRAY);
        gameTitleLabel = new JLabel("LABYRINTH"); // Setting Title text
        gameTitleLabel.setForeground(Color.ORANGE);
        gameTitleLabel.setFont(titleFont);

        startBtnPanel = new JPanel(); //  Creating Panel for behind start button
        startBtnPanel.setBounds(300, 450, 400, 200);
        startBtnPanel.setBackground(Color.DARK_GRAY);

        startButton = new JButton("Begin");  // Creating Start Button
        startButton.setBackground(Color.GRAY);
        startButton.setForeground(Color.ORANGE);
        startButton.setFont(beginFont);


        gameTitlePanel.add(gameTitleLabel);
        startBtnPanel.add(startButton);


        con.add(gameTitlePanel);
        con.add(startBtnPanel);

    }

    public void createGameplayScreen(){

        mainPlayPanel = new JPanel(); // Creating gameplay panel
        mainPlayPanel.setBounds(150, 150, 800, 400);
        mainPlayPanel.setBackground(Color.DARK_GRAY);
        con.add(mainPlayPanel);

        mainText = new JTextArea(); // Created Textarea for main gameplay window
        mainText.setBounds(150, 150, 800, 400);
        mainText.setBackground(Color.DARK_GRAY);
        mainText.setForeground(Color.WHITE);
        mainText.setFont(beginFont);
        mainText.setLineWrap(true);
        mainPlayPanel.add(mainText);
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