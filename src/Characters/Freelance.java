package Characters;

public class Freelance implements Setting{


    public void warriorGameplay(){

        try{
            do {
                switch (userPickedSetting){
                    case ("Mountain Top"):
                        userPickedSetting.equals("1");
                        System.out.println("You have chosen to test your luck through the frozen tundra of the mountain top as the Sprinting Freelance\nMind you that the Freelance's strengths lie in incredible speed and close-quarter combat.\nYou should fair well on the steep cliffs and slippery icy terrain that are around every corner of this mountain.\n Good luck!");
                        break;
                    case ("City Streets"):
                        userPickedSetting.equals("2");
                        System.out.println("You have have chosen to test your luck with the unforgiving streets of the forbidden city as the Sprinting Freelance\nMind you that the Freelance's speed fairs well in the close quarters of the forbidden city streets.\n Good luck!");
                        break;
                    case ("Forest of Futility"):
                        userPickedSetting.equals("3");
                        System.out.println("You have chosen to test your luck in the Forest of Futility as the Sprinting Freelance\nThis map plays to the strengths of the Freelance's with open spaces and freedom to move and limited visibility it is the perfect place for you to showcase your skills.\n Good luck!");
                        break;
                    case ("Highrise"):
                        userPickedSetting.equals("4");
                        System.out.println("You have chosen to test your luck in the highrise skyscraper as the Sprinting Freelance\n Here you will find difficult ways to navigate the numerous floors on your way to the top.\n Good luck!");
                        break;
                    case ("Pueblo"):
                        userPickedSetting.equals("5");
                        System.out.println("You have chosen the native Pueblo city as the Sprinting Freelance\n You will find the tight terrain and frequent close-quarter occurrences to work against you.\n Good luck!");
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
