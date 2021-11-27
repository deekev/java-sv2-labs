package defaultconstructor.chess;

import java.util.Arrays;
import java.util.List;

public class ChessTournament {

    private List<Team> teams;

    public ChessTournament() {
        teams = Arrays.asList(new Team(), new Team(), new Team());
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void addPlayersToTeams(List<Player> playersRegistrated) {
        for (int i = 0; i < (teams.size() * 2); i++) {
            createTeams(i, playersRegistrated);
        }
    }

    private void createTeams(int numberOfPlayers, List<Player> players) {
        if (players.size() >= numberOfPlayers + 1) {
            if (numberOfPlayers % 2 == 0) {
                teams.get(numberOfPlayers / 2).setPlayerOne(players.get(numberOfPlayers));
            } else {
                teams.get(numberOfPlayers / 2).setPlayerTwo(players.get(numberOfPlayers));
            }
        }
    }
}