import java.util.Scanner;

public class EnterBlueprint {
    Scanner scan = new Scanner(System.in);

    public EnterBlueprint() {

        System.out.println("Please enter your moniker: ");
        String userName = scan.next();

        System.out.printf("Hello %s, Glad to see you would like to tempt your fate...", userName);

        System.out.println("Please %s, choose your type of hero!\n" +
                "");
        int typeHero = scan.nextInt();


    }
}
