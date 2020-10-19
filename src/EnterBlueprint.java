import java.util.Scanner;

public class EnterBlueprint {
    Scanner scan = new Scanner(System.in);

    public EnterBlueprint() {

        System.out.println("Please enter your moniker: ");
        String userName = scan.next();

        System.out.printf("Hello %s, Glad to see you would like to tempt your fate...", userName);
    }

    public void fighterSelector(){
        System.out.println("Please %s, choose your type of hero!\n" +
                "1 - Shining Knight\n" +
                "2 - Shonen Warrior\n" +
                "3 - Kamikaze\n" +
                "4 - Battle Warrior\n" +
                "5 - Sprinting Freelance");

    }
    public void knightGameplay(){
        System.out.println("Where would you like to start?\n" +
                "Mountain Top - A road of fortunes or misfortunes embedded in a towering frozen tundra." +
                "City Streets - A barren city abandoned of all virtuous beings with surprises around every corner." +
                "Forest of Futility - A dark magical forest containing menacing beings who's only objective is your demise." +
                "Highrise - A towering inferno of challenges that can make the sanest person on the planet go mad in minutes" +
                "Pueblo - Native village with outlaws and virtue seekers looking for your head.");
    }
}
