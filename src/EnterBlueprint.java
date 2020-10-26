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
}
