package Characters;

import java.util.Scanner;

public interface Setting {
    Scanner scan = new Scanner(System.in);

    public static String settingSelect(){
        System.out.println("Where would you like to start?\n" +
                "1 - Mountain Top - A road of fortunes or misfortunes embedded in a towering frozen tundra." +
                "2 - City Streets - A barren city abandoned of all virtuous beings with surprises around every corner." +
                "3 - Forest of Futility - A dark magical forest containing menacing beings who's only objective is your demise." +
                "4 - Highrise - A towering inferno of challenges that can make the sanest person on the planet go mad in minutes" +
                "5 - Pueblo - Native village with outlaws and virtue seekers looking for your head.");
        return null;
    }
    String userPickedSetting = scan.nextLine();
    }

