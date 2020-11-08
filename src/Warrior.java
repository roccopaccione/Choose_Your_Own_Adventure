import java.util.Scanner;

public class Warrior {
    Scanner scan = new Scanner(System.in);

    public void warriorGameplay(){
        System.out.println("Where would you like to start?\n" +
                "1 - Mountain Top - A road of fortunes or misfortunes embedded in a towering frozen tundra." +
                "2 - City Streets - A barren city abandoned of all virtuous beings with surprises around every corner." +
                "3 - Forest of Futility - A dark magical forest containing menacing beings who's only objective is your demise." +
                "4 - Highrise - A towering inferno of challenges that can make the sanest person on the planet go mad in minutes" +
                "5 - Pueblo - Native village with outlaws and virtue seekers looking for your head.");
        String userPickedSetting = scan.nextLine();
        try{
            do {
                switch (userPickedSetting){
                    case ("Mountain Top"):
                        userPickedSetting.equals("1");
                        System.out.println("You have chosen to test your luck through the frozen tundra of the mountain top as the Shonen Warrior\nMind you that the Warriors strengths lie in fleeting speed or strobe like elusiveness.\nYou should fair well on the steep cliffs and slippery icy terrain that are around every corner of this mountain.\n Good luck!");
                        break;
                    case ("City Streets"):
                        userPickedSetting.equals("2");
                        System.out.println("You have have chosen to test your luck with the unforgiving streets of the forbidden city as the Shonen Warrior\nMind you that the Warriors quickness does fair well in the close quarters of the forbidden city streets.\n Good luck!");
                        break;
                    case ("Forest of Futility"):
                        userPickedSetting.equals("3");
                        System.out.println("You have chosen to test your luck in the Forest of Futility as the Shonen Warrior\nThis map does not play to the strengths of the warrior with open spaces and freedom to move and limited visibility it is not the perfect place for you to showcase your skills.\n Good luck!");
                        break;
                    case ("Highrise"):
                        userPickedSetting.equals("4");
                        System.out.println("You have chosen to test your luck in the highrise skyscraper as the Shonen Warrior\n Here you will find difficult ways to navigate the numerous floors on your way to the top.\n Good luck!");
                        break;
                    case ("Pueblo"):
                        userPickedSetting.equals("5");
                        System.out.println("You have chosen the native Pueblo city as the Shonen Warrior\n You will find the tight terrain and frequent close-quarter occurrences to work to your advantage. \n Good luck!");
                        break;
                    default:
                        System.out.println("Please pick a valid option.");
                }
            } while(true);
        } catch (Exception e){
            System.out.println("Please enter a valid option.");
        }

    }

}
