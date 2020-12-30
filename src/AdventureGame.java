import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class AdventureGame {
   JFrame window;
   Container con;
   JPanel gameTitlePanel, startBtnPanel, mainPlayPanel, gameplayChoiceButtonPanel;
   JLabel gameTitleLabel;
   Font titleFont = new Font("Times New Roman", Font.PLAIN, 85);
   Font buttonFont = new Font("Sans-Serif", Font.PLAIN, 40);
   JButton startButton, gpChoice1, gpChoice2, gpChoice3, gpChoice4;
   JTextArea mainText;

   GameplayScreenHandler gpHandler = new GameplayScreenHandler();


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
        startButton.setFont(buttonFont);
        startButton.addActionListener(gpHandler); // Create action listener to call GameplayScreenHandler class


        gameTitlePanel.add(gameTitleLabel);
        startBtnPanel.add(startButton);


        con.add(gameTitlePanel);
        con.add(startBtnPanel);

    }

    public void createGameplayScreen(){

        gameTitlePanel.setVisible(false); // Hiding after action listener
        startBtnPanel.setVisible(false);

        mainPlayPanel = new JPanel(); // Creating gameplay panel
        mainPlayPanel.setBounds(150, 150, 800, 400);
        mainPlayPanel.setBackground(Color.DARK_GRAY);
        con.add(mainPlayPanel);

        mainText = new JTextArea(); // Created Textarea for main gameplay window
        mainText.setBounds(150, 150, 800, 400);
        mainText.setBackground(Color.DARK_GRAY);
        mainText.setForeground(Color.ORANGE);
        mainText.setFont(titleFont);
        mainText.setLineWrap(true);
        mainPlayPanel.add(mainText);

        gameplayChoiceButtonPanel = new JPanel(); // Create Panel for Gameplay Choices
        gameplayChoiceButtonPanel.setBounds(150, 150,600,250);
        gameplayChoiceButtonPanel.setBackground(Color.DARK_GRAY);
        con.add(gameplayChoiceButtonPanel);

        gpChoice1 = new JButton(); // Create Button for Gameplay Choices
        gpChoice1.setBackground(Color.DARK_GRAY);
        gpChoice1.setForeground(Color.WHITE);
        gpChoice1.setFont(buttonFont);
        gameplayChoiceButtonPanel.add(gpChoice1);

        gpChoice2 = new JButton();
        gpChoice2.setBackground(Color.DARK_GRAY);
        gpChoice2.setForeground(Color.WHITE);
        gpChoice2.setFont(buttonFont);
        gameplayChoiceButtonPanel.add(gpChoice2);

        gpChoice3 = new JButton();
        gpChoice3.setBackground(Color.DARK_GRAY);
        gpChoice3.setForeground(Color.WHITE);
        gpChoice3.setFont(buttonFont);
        gameplayChoiceButtonPanel.add(gpChoice3);

        gpChoice4 = new JButton();
        gpChoice4.setBackground(Color.DARK_GRAY);
        gpChoice4.setForeground(Color.WHITE);
        gpChoice4.setFont(buttonFont);
        gameplayChoiceButtonPanel.add(gpChoice4);

    }

    public class GameplayScreenHandler implements ActionListener{

        public void actionPerformed(ActionEvent e){

            createGameplayScreen(); // Calling on Click event
        }
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