package section1;

import java.util.ArrayList;

public class PlayerBO {
    public void displayAllPlayerDetails(ArrayList<Player> playerlist) {

        System.out.println("PlayerDetails");
        for (Player player : playerlist) {

            System.out.println(player);

        }

    }
}
