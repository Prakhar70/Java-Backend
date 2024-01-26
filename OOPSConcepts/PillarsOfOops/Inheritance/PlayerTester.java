package OOPSConcepts.PillarsOfOops.Inheritance;

import java.util.List;

public class PlayerTester {
    public static void main(String[] args) {
        Player hp=new HumanPlayer();
        hp.CelebrateVictory();
        Player cp=new ComputerPlayer();
        cp.CelebrateVictory();
    }
    public void StartGame(List<Player> players){
        for(Player player:players){
            player.play();
        }
    }
}
