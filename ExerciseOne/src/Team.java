import java.util.ArrayList;

public class Team  {
    private String fondation;
    private String name;
    private int counter;
    private ArrayList<Player> players;

    public Team(String fondation, String name) {
        this.fondation = fondation;
        this.name = name;
        this.counter = 0;
        this.players = new ArrayList<>();
    }

    public Team(String name, int year) {

    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player player) {
        players.add(player);
        this.counter++;
    }

    public ArrayList<Player> findPlayerByName(String name){
        ArrayList<Player> foundPlayer = new ArrayList<>();

        /*Ciclo e condizione per recuperare i giocatori con le caratteristiche corrispondenti*/
        for(int i = 0; i < this.counter; i++){
            if (players.get(i).getName().equals(name))
                foundPlayer.add(players.get(i));
        }

        return foundPlayer;
    }

    public ArrayList<Player> findPlayerByRole(String role){
        ArrayList<Player> foundRole = new ArrayList<>();

        for(int i = 0; i< this.counter; i++){
            if(players.get(i).getRole().equals(role))
                foundRole.add(players.get(i));
        }

        return foundRole;
    }
}
