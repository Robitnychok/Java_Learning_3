package part3_Generics.game_Repeat;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team <T extends Participant>{
    private String teamName;
    private List<T> participe = new ArrayList<>();

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public void addNewPart (T particip){
        participe.add(particip);
        System.out.println("In the team "+ teamName +"was added a new participant named "+
        particip.getName());
    }

    public void teamWinner (Team <T> team){
        String winnerName;
        Random random = new Random();
        int n = random.nextInt(2);
        if ( n == 1 ){
            winnerName = team.teamName;
        } else {
            winnerName = this.teamName;
        }
        System.out.println("The team "+ winnerName + " won" );
    }
}
