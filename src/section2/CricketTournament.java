package section2;

import java.util.ArrayList;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CricketTournament {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String playerName = null;
        long runs = 0L;
        HashMap<String, Long> hm = new HashMap<String, Long>();
        System.out.println("Enter the number of players");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            System.out.println("Enter the details of the player" + i);
            playerName = sc.nextLine();
            runs = sc.nextLong();
            hm.put(playerName, runs);
        }
        ArrayList<String> key = new ArrayList<String>();
        ArrayList<Long> value = new ArrayList<Long>();
        LinkedHashMap<String, Long> lhm = new LinkedHashMap<String, Long>(hm);
        lhm.putAll(hm);
        for (Map.Entry<String, Long> me : lhm.entrySet()) {
            key.add(me.getKey());
            value.add(me.getValue());
        }

        long max = Collections.max(value);
        int index = -1;
        for (int i = 0; i < value.size(); i++) {
            if (max == value.get(i)) {
                index = i;
                break;
            }
        }
        System.out.println(key.get(index));
        sc.close();
    }

}
