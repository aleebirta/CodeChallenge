package rockPaperScrissors;

import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;

public class Player extends Thread {

    public String option;

    @Override
    public void run() {
        List<String> options = asList("paper", "scissors", "rock");
        option = options.get(new Random().nextInt(3));
    }
}
