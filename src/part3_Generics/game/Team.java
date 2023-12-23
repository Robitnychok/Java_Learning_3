package part3_Generics.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team <T extends Participants>{
    private String name;
    private List<T> participant = new ArrayList<>();

    public Team (String name){
        this.name = name;
    }

    public void AddNewParticipant (T participants){
        participant.add(participants);
        System.out.println("In the team " + name + "was added a new participant named "
                + ((Participants)participants).getName());
    }

    public void playWith (Team <T> team){
        String winnerName;
        Random random = new Random();
        int n = random.nextInt(2);
        if (n == 0){
            winnerName = this.name;
        } else{
            winnerName = team.name;
        }
        System.out.println("The team " + winnerName + "won");
    }
}
