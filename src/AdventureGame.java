import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class AdventureGame {
   JFrame window;
   Container con;
   JPanel gameTitlePanel, startBtnPanel, mainPlayPanel, gameplayChoiceButtonPanel, playerInfoPanel;
   JLabel gameTitleLabel, hitPointLabel, healthLabelNumber, characterLabel, characterLabelValue;
   Font titleFont = new Font("Times New Roman", Font.PLAIN, 85);
   Font buttonFont = new Font("Sans-Serif", Font.PLAIN, 40);
   Font headingFont = new Font("Sans-Serif", Font.PLAIN, 25);
   JButton startButton, gpChoice1, gpChoice2, gpChoice3, gpChoice4;
   JTextArea mainText;
   int health;
   String character;

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
        startButton.setFocusPainted(false);


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

        mainText = new JTextArea("Choose Your Fighter!"); // Created Textarea for main gameplay window
        mainText.setBounds(150, 150, 800, 400);
        mainText.setBackground(Color.DARK_GRAY);
        mainText.setForeground(Color.ORANGE);
        mainText.setFont(titleFont);
        mainText.setLineWrap(true);
        mainPlayPanel.add(mainText);

        gameplayChoiceButtonPanel = new JPanel(); // Create Panel for Gameplay Choices
        gameplayChoiceButtonPanel.setBounds(175, 300,700,300);
        gameplayChoiceButtonPanel.setBackground(Color.DARK_GRAY);
        gameplayChoiceButtonPanel.setLayout(new GridLayout(4, 1));
        con.add(gameplayChoiceButtonPanel);


        gpChoice1 = new JButton("Shonen Warrior"); // Create Button for Gameplay Choices
        gpChoice1.setBackground(Color.DARK_GRAY);
        gpChoice1.setForeground(Color.WHITE);
        gpChoice1.setFont(buttonFont);
        gpChoice1.setFocusPainted(false);
        gameplayChoiceButtonPanel.add(gpChoice1);

        gpChoice2 = new JButton("Sprinting Freelance");
        gpChoice2.setBackground(Color.DARK_GRAY);
        gpChoice2.setForeground(Color.WHITE);
        gpChoice2.setFont(buttonFont);
        gpChoice2.setFocusPainted(false);
        gameplayChoiceButtonPanel.add(gpChoice2);

        gpChoice3 = new JButton("Battle Warrior");
        gpChoice3.setBackground(Color.DARK_GRAY);
        gpChoice3.setForeground(Color.WHITE);
        gpChoice3.setFont(buttonFont);
        gpChoice3.setFocusPainted(false);
        gameplayChoiceButtonPanel.add(gpChoice3);

        gpChoice4 = new JButton("Kamikaze");
        gpChoice4.setBackground(Color.DARK_GRAY);
        gpChoice4.setForeground(Color.WHITE);
        gpChoice4.setFont(buttonFont);
        gpChoice4.setFocusPainted(false);
        gameplayChoiceButtonPanel.add(gpChoice4);


        playerInfoPanel = new JPanel();
        playerInfoPanel.setBounds(150,20,800,50);
        playerInfoPanel.setBackground(Color.DARK_GRAY);
        playerInfoPanel.setLayout(new GridLayout(1,4));
        con.add(playerInfoPanel);

        hitPointLabel = new JLabel("Health:");
        hitPointLabel.setFont(headingFont);
        hitPointLabel.setForeground(Color.WHITE);
        playerInfoPanel.add(hitPointLabel);
        healthLabelNumber = new JLabel();
        healthLabelNumber.setFont(headingFont);
        healthLabelNumber.setForeground(Color.WHITE);
        playerInfoPanel.add(healthLabelNumber);

        characterLabel = new JLabel("Character:");
        characterLabel.setFont(headingFont);
        characterLabel.setForeground(Color.WHITE);
        playerInfoPanel.add(characterLabel);    // Add character label to info panel
        characterLabelValue = new JLabel();
        characterLabelValue.setFont(headingFont);
        characterLabelValue.setForeground(Color.WHITE);
        playerInfoPanel.add(characterLabelValue);   // Add character to info panel

        playerSetup();

    }

    public void playerSetup() {
        health = 15;
        character = "Shonen Warrior";
        characterLabelValue.setText(character);
        hitPointLabel.setText("" + health);

        playerChoice();
    }
    public void playerChoice(){
        mainText.setText("Choose Your Fighter!");

        gpChoice1.setText("Shonen Warrior");
        gpChoice2.setText("Sprinting Freelance");
        gpChoice3.setText("Battle Warrior");
        gpChoice4.setText("Kamikaze");
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