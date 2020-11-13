package Characters;

public class Knight implements Setting{

    public void knightGameplay(){

            try{
                do {
                    switch (userPickedSetting){
                        case ("Mountain Top"):
                            userPickedSetting.equals("1");
                            System.out.println("You have chosen to test your luck through the frozen tundra of the mountain top as the Shining Knight\nMind you that the Knights strengths do not lie in fleeting speed or strobe like elusiveness, but more in brute strength and swordsmanship\nWhile he is equipped on horseback try to avoid the steep cliffs and slippery icy terrain that are around every corner of this mountain.\n Good luck!");
                            break;
                        case ("City Streets"):
                            userPickedSetting.equals("2");
                            System.out.println("You have have chosen to test your luck with the unforgiving streets of the forbidden city\nMind you that the Knights lack of quickness does not fair well in the close quarters of the forbidden city streets.\n Good luck!");
                            break;
                        case ("Forest of Futility"):
                            userPickedSetting.equals("3");
                            System.out.println("You have chosen to test your luck in the Forest of Futility\nThis map plays to the strengths of the Knight with open spaces and freedom to move and limited visibility it is the perfect place for you to showcase your skills.\n Good luck!");
                            break;
                        case ("Highrise"):
                            userPickedSetting.equals("4");
                            System.out.println("You have chosen to test your luck in the highrise skyscraper\n Here you will find difficult ways to navigate the numerous floors on your way to the top.\n Good luck!");
                            break;
                        case ("Pueblo"):
                            userPickedSetting.equals("5");
                            System.out.println("You have chosen the native Pueblo city\n You will find difficulties with the tight terrain and frequent close-quarter occurrences. \n Good luck!");
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
