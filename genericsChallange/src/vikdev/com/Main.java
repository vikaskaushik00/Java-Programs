package vikdev.com;

public class Main {

    public static void main(String[] args) {
        League<Team<FootballPlayer>> league = new League<>("AFL");
        Team<FootballPlayer> delhi = new Team<>("Delhi");
        Team<FootballPlayer> mumbai = new Team<>("mumbai");
        Team<FootballPlayer> jaipur = new Team<>("jaipur");
        delhi.matchResult(mumbai,1,0);
        league.adTeam(delhi);
        league.adTeam(mumbai);
        league.adTeam(jaipur);
        league.showLeagueTable();

    }
}
