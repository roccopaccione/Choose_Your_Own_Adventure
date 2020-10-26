import java.util.Scanner;

public class Knight {
    Scanner scan = new Scanner(System.in);

    public void knightGameplay(){
        System.out.println("Where would you like to start?\n" +
                "Mountain Top - A road of fortunes or misfortunes embedded in a towering frozen tundra." +
                "City Streets - A barren city abandoned of all virtuous beings with surprises around every corner." +
                "Forest of Futility - A dark magical forest containing menacing beings who's only objective is your demise." +
                "Highrise - A towering inferno of challenges that can make the sanest person on the planet go mad in minutes" +
                "Pueblo - Native village with outlaws and virtue seekers looking for your head.");
        String userPickedSetting = scan.nextLine();
        if (userPickedSetting.equalsIgnoreCase("Mountain Top")){
            System.out.println("You have chosen to test your luck through the frozen tundra of the mountain top as the Shining Knight\nMind you that the Knights strengths do not lie in fleeting speed or strobe like elusiveness, but more in brute strength and swordsmanship\nWhile he is equipped on horseback try to avoid the steep cliffs and slippery icy terrain that are around every corner of this mountain.");
            System.out.println("Are you ready to proceed y/n?");

        }
    }
}
